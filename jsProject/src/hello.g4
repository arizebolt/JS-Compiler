grammar hello;

@headers {
	import AST.*
}

start returns [ASTnode node] 
    : t1=statement {$node = $t1.node; $node.print();};


statement returns [ASTnode node]
    : t1=block {$node = new StmBlock($t1.node);}
    | t2=variableStatement {$node = new VarStm($t2.node);}
    | t3=importStatement {$node = new ImportStm($t3.node);}
    | exportStatement
    | emptyStatement_
    | classDeclaration
    | functionDeclaration
    | expressionStatement
    | ifStatement
    | iterationStatement
    | continueStatement
    | breakStatement
    | returnStatement
    | yieldStatement
    | withStatement
    | labelledStatement
    | switchStatement
    | throwStatement
    | tryStatement
    | debuggerStatement
    | consoleStatement
    | alertStatement
    ;

block returns [ASTNode node]
    : OpenBrace t1=statementList CloseBrace {$node = new BlockStmList($t1.node);}
    | OpenBrace CloseBrace
    ;

statementList
    : statement+
    ;


importStatement returns [ASTNode node]
    : Import t1=importFromBlock  {$node = new ImportStmList($t1.node);}
    ;

importFromBlock
    : importNamespace importFrom eos
    | importDefault importNamespace importFrom eos
    | importModuleItems importFrom eos
    | importDefault importModuleItems importFrom eos
    | StringLiteral eos
    ;

importModuleItems
    : '{' b c '}'
    ;
    
b : importAliasName ',' b ;

c : importAliasName c | importAliasName ',' c ;

importAliasName
    : moduleExportName As importedBinding | moduleExportName 
    ;



moduleExportName
    : identifierName
    | StringLiteral
    ;

// yield and await are permitted as BindingIdentifier in the grammar
importedBinding
    : Identifier
    | Yield
    | Await
    ;

importDefault
    : aliasName ','
    ;

importNamespace
	: '*' 
	| '*' As identifierName
	| identifierName
	| identifierName As identifierName
    ;

importFrom
    : From StringLiteral
    ;

aliasName
    : identifierName As identifierName
    | identifierName
    ;

exportStatement
    : Export Default? (exportFromBlock | declaration) eos    # ExportDeclaration
//    : Export exportFromBlock eos
//    | Export declaration eos
//    | Export Default exportFromBlock eos
//    | Export Default declaration eos
    | Export Default singleExpression eos                    # ExportDefaultDeclaration
    ;

exportFromBlock
    : importNamespace importFrom eos
    | exportModuleItems importFrom eos
    | exportModuleItems eos
    ;

exportModuleItems
    : '{' d e '}'
    ;
    
d : exportAliasName ',' d  ;

e : exportAliasName | exportAliasName ',' ;

exportAliasName
    : moduleExportName As moduleExportName
    | moduleExportName
    ;

declaration
    : variableStatement
    | classDeclaration
    | functionDeclaration
    ;

tryStatement
    : Try block catchProduction catchHelper
    | Try block finallyProduction catchHelper
    | Try block catchHelper
    ;
    
catchProduction 
    : Catch '(' assignable ')' block
    | Catch block
    ;

//catchProduction 
//    : Catch '(' assignable ')' block
//    | Catch block
//    ;
//    
catchHelper
    : 
    | catchProduction finallyProduction catchHelper
    | catchProduction
    ;

variableStatement returns [ASTNode node]
    : t1=variableDeclarationList t2=eos {$node = new VarDeclList($t1.node, $t2.node);}
    ;

variableDeclarationList
    : varModifier variableDeclaration f
    ;

f : ',' variableDeclaration f |  ;

variableDeclaration
    :assignable '=' singleExpression 
    |assignable
    ;
    


emptyStatement_
    : SemiColon
    ;

expressionStatement
    : expressionSequence eos
    | expressionSequence eos
    ;

ifStatement
    : If '(' expressionSequence ')' statement Else statement
    | If '(' expressionSequence ')' statement
    ;


iterationStatement
    : Do statement While '(' expressionSequence ')' eos nonTerminal1
    | While '(' expressionSequence ')' statement nonTerminal1
    | For '('forDeclaration expressionSequence nonTerminal2 ';' expressionSequence nonTerminal2 ';' expressionSequence nonTerminal2 ')' statement nonTerminal1
    | For '(' singleExpression In expressionSequence ')' statement nonTerminal1
//    | For Await '(' singleExpression varModifier Of expressionSequence ')' statement nonTerminal1
	| For '(' forDeclaration singleExpression Of expressionSequence ')' statement nonTerminal1
    ;
forDeclaration: varModifier | ;
nonTerminal1
    : 
    | iterationStatement nonTerminal1
    ;

nonTerminal2
    : 
    | ',' forDeclaration expressionSequence nonTerminal2| 
    ;

varModifier
    : Var
    | Let
    | Const
    ;

continueStatement
    : Continue identifier eos
    | Continue eos
    ;


breakStatement
    : Break identifier eos
    | Break eos
    ;

returnStatement
    : Return expressionSequence eos
    | Return identifier eos
    | Return eos
    ;

yieldStatement
    : Yield expressionSequence eos
    | Yield identifier eos
    | Yield eos
    ;

withStatement
    : With '(' expressionSequence ')' statement
    ;

switchStatement
    : Switch '(' expressionSequence ')' caseBlock
    ;

caseBlock
//    : '{' caseClauses? (defaultClause caseClauses?)? '}'
    : '{' caseClauses defaultClause '}'
    | '{' caseClauses defaultClause caseClauses '}'
    | '{' caseClauses '}'
    | '{' defaultClause '}'
    | '{' defaultClause caseClauses '}'
    | '{''}'
    ;

caseClauses
    : g
    ;

g : caseClause g | caseClause ;

caseClause
    : Case expressionSequence ':' statementList
    | Case expressionSequence ':'
    ;

defaultClause
    : Default ':' defaultHelper
    | Default ':' 
    ;
defaultHelper: statementList | ;

labelledStatement
    : identifier ':' statement
    ;

throwStatement
    : Throw expressionSequence eos
    ;
// these are commented for other reasons

//tryStatement
//    : Try block catchProduction catchHelper
//    | Try block finallyProduction catchHelper
//    ;

//catchHelper
//    : 
//    | catchProduction finallyProduction catchHelper
//    ;

//catchProduction 
//    : Catch '(' assignable ')' block
//    | Catch block
//    ;

finallyProduction
    : Finally block
    ;

/// above were commented
debuggerStatement
    : Debugger eos
    ;

functionDeclaration
    : async Function_ star identifier '(' formalParListHelp ')' functionBody
    ;
async:
	Async | ;
    
star
    : '*'
    | 
    ;
formalParListHelp: formalParameterList | ;
//classDeclaration
//    : Class identifier classTail
//    ;

//classTail
//    :classHelper '{' classElHelper '}'
//    ;
classHelper:Extends singleExpression| ;

classElHelper:classElement classElHelper | ;

//classElement
//    : statOrIdHelper methodDefinition
//    | statOrIdHelper fieldDefinition
//    | statOrId block
//    | emptyStatement_
//    ;
    
// class stuff
classDeclaration
    : Class identifier classTail
    ;

classTail
    : classHeritage? '{' classBody '}'
    ;

classHeritage
    : Extends singleExpression
    ;

classBody
    : classElementList
    ;

classElementList
    : classElement+
    ;

classElement
    : methodDefinition
    | fieldDefinition
    // ... other class elements
    ;

//methodDefinition
//    : Identifier '(' formalParameterList ')' functionBody
//    ;

//fieldDefinition
//    : Identifier initializer?
//    ;    
  
statOrId:Static |  identifier;
statOrIdHelper: statOrId | ;
methodDefinition
    : async star classElementName '(' formalParListHelp ')' functionBody
    | star getter '(' ')' functionBody
    | star setter '(' formalParListHelp ')' functionBody
    ;

fieldDefinition
    : classElementName initializer?
    ;

classElementName
    : propertyName
    | privateIdentifier
    ;

privateIdentifier
    : '#' identifierName
    ;

formalParameterList
    : formalParameterArg formalParameterArgHelper lastFormalParameterArgHelper
    | lastFormalParameterArg
    ;

formalParameterArgHelper:',' formalParameterArg formalParameterArgHelper| ;

lastFormalParameterArgHelper: ',' lastFormalParameterArg | ;

formalParameterArg
    : assignable singleExpressionHelper    // ECMAScript 6: Initialization
    ;
singleExpressionHelper:'=' singleExpression| ;
lastFormalParameterArg                        // ECMAScript 6: Rest Parameter
    : Ellipsis singleExpression
    ;

functionBody
    : '{' sourceElementsHelper '}'
    ;
sourceElementsHelper:sourceElements| ;
sourceElements
    : start | start sourceElements
    ;

arrayLiteral
    : ('[' elementList ']')
    ;

elementList
    :  arrayElementHelper elementListHelper 
    ;
    
comma: ',' comma | ;
arrayElementHelper: arrayElement | ; 
elementListHelper: (comma arrayElement) elementListHelper | ;

arrayElement
    : ellipsis singleExpression
    ;
ellipsis:Ellipsis | ;
propertyAssignment
    : propertyName ':' singleExpression                                             # PropertyExpressionAssignment
    | '[' singleExpression ']' ':' singleExpression                                 # ComputedPropertyExpressionAssignment
    | async star propertyName '(' formalParListHelp  ')'  functionBody  # FunctionProperty
    | getter '(' ')' functionBody                                           # PropertyGetter
    | setter '(' formalParameterArg ')' functionBody                        # PropertySetter
    | ellipsis singleExpression                                                    # PropertyShorthand
    ;

consoleStatement
    : Console Dot (Log | Alert) '(' expressionSequence ')' eos
    ;

    
alertStatement
    : Alert '(' expressionSequence ')' eos
    ;

propertyName
    : identifierName
    | StringLiteral
    | numericLiteral
    | '[' singleExpression ']'
    ;

arguments
    : '('argumentsHelper')'
    ;
argumentsRepeatHelper:(',' argument) argumentsRepeatHelper| ;
argumentsHelper: argument argumentsHelper comma | ;
argument
    : ellipsis (singleExpression | identifier)
    ;

expressionSequence
    : singleExpression expressionSequenceHelper
    ;
    
expressionSequenceHelper:',' singleExpression expressionSequenceHelper| ;
either:'?.'| ;
hash:'#'| ;
identifierHelper:identifier | ;
singleExpression
    : anonymousFunction                                                     # FunctionExpression
    | Class identifierHelper classTail                                           # ClassExpression
    | singleExpression '?.' singleExpression                                # OptionalChainExpression
    | singleExpression either '[' expressionSequence ']'                     # MemberIndexExpression
    | singleExpression either '.' hash identifierName                         # MemberDotExpression
    // Split to try new Date() first, then new Date.
    | New identifier arguments                                              # NewExpression
    | New singleExpression arguments                                        # NewExpression
    | New singleExpression                                                  # NewExpression
    | singleExpression arguments                                            # ArgumentsExpression
    | New '.' identifier                                                    # MetaExpression // new.target
    | singleExpression  '++'                     # PostIncrementExpression
    | singleExpression  '--'                     # PostDecreaseExpression
    | Delete singleExpression                                               # DeleteExpression
    | Void singleExpression                                                 # VoidExpression
    | Typeof singleExpression                                               # TypeofExpression
    | '++' singleExpression                                                 # PreIncrementExpression
    | '--' singleExpression                                                 # PreDecreaseExpression
    | '+' singleExpression                                                  # UnaryPlusExpression
    | '-' singleExpression                                                  # UnaryMinusExpression
    | '~' singleExpression                                                  # BitNotExpression
    | '!' singleExpression                                                  # NotExpression
    | Await singleExpression                                                # AwaitExpression
    |singleExpression '**' singleExpression                  # PowerExpression
    | singleExpression ('*' | '/' | '%') singleExpression                   # MultiplicativeExpression
    | singleExpression ('+' | '-') singleExpression                         # AdditiveExpression
    | singleExpression '??' singleExpression                                # CoalesceExpression
    | singleExpression ('<<' | '>>' | '>>>') singleExpression               # BitShiftExpression
    | singleExpression ('<' | '>' | '<=' | '>=') singleExpression           # RelationalExpression
    | singleExpression Instanceof singleExpression                          # InstanceofExpression
    | singleExpression In singleExpression                                  # InExpression
    | singleExpression ('==' | '!=' | '===' | '!==') singleExpression       # EqualityExpression
    | singleExpression '&' singleExpression                                 # BitAndExpression
    | singleExpression '^' singleExpression                                 # BitXOrExpression
    | singleExpression '|' singleExpression                                 # BitOrExpression
    | singleExpression '&&' singleExpression                                # LogicalAndExpression
    | singleExpression '||' singleExpression                                # LogicalOrExpression
    | singleExpression '?' singleExpression ':' singleExpression            # TernaryExpression
    |singleExpression '=' singleExpression                   # AssignmentExpression
    |singleExpression assignmentOperator singleExpression    # AssignmentOperatorExpression
    | Import '(' singleExpression ')'                                       # ImportExpression
    | yieldStatement                                                        # YieldExpression // ECMAScript 6
    | This                                                                  # ThisExpression
    | identifier                                                            # IdentifierExpression
    | Super                                                                 # SuperExpression
    | literal                                                               # LiteralExpression
    | arrayLiteral                                                          # ArrayLiteralExpression
    | objectLiteral                                                         # ObjectLiteralExpression
    | '(' expressionSequence ')'                                            # ParenthesizedExpression
    ;

initializer
// TODO: must be = AssignmentExpression and we have such label alredy but it doesn't respect the specification.
//  See https://tc39.es/ecma262/multipage/ecmascript-language-expressions.html#prod-Initializer
    : '=' singleExpression
    ;

assignable
    : identifier
    | arrayLiteral
    | objectLiteral
    ;

objectLiteral
    : '{' objectLiteralHelper '}'
    ;
propertyAssignmentHelper:',' propertyAssignment propertyAssignmentHelper | ;
objectLiteralHelper:propertyAssignment propertyAssignmentHelper comma| ;
anonymousFunction
    : async Function_ star '(' formalParListHelp ')' functionBody    # AnonymousFunctionDecl
    | async arrowFunctionParameters '=>' arrowFunctionBody                     # ArrowFunction
    ;

arrowFunctionParameters
    : identifier
    | '(' formalParListHelp ')'
    ;

arrowFunctionBody
    : singleExpression
    | functionBody
    ;

assignmentOperator
    : '*='
    | '/='
    | '%='
    | '+='
    | '-='
    | '<<='
    | '>>='
    | '>>>='
    | '&='
    | '^='
    | '|='
    | '**='
    ;

literal
    : NullLiteral
    | BooleanLiteral
    | StringLiteral
    | RegularExpressionLiteral
    | numericLiteral
    | bigintLiteral
    ;





numericLiteral
    : DecimalLiteral
    | HexIntegerLiteral
    | OctalIntegerLiteral
    | OctalIntegerLiteral2
    | BinaryIntegerLiteral
    ;

bigintLiteral
    : BigDecimalIntegerLiteral
    | BigHexIntegerLiteral
    | BigOctalIntegerLiteral
    | BigBinaryIntegerLiteral
    ;

getter
    : identifier classElementName
    ;

setter
    : identifier classElementName
    ;

identifierName
    : identifier
    | reservedWord
    ;

identifier
    : Identifier
    | Async
    | As
    | From
    | Yield
    | Of
    ;

reservedWord
    : keyword
    | NullLiteral
    | BooleanLiteral
    ;

keyword
    : Break
    | Do
    | Instanceof
    | Typeof
    | Case
    | Else
    | New
    | Var
    | Catch
    | Finally
    | Return
    | Void
    | Continue
    | For
    | Switch
    | While
    | Debugger
    | Function_
    | This
    | With
    | Default
    | If
    | Throw
    | Delete
    | In
    | Try
    | Class
    | Enum
    | Extends
    | Super
    | Const
    | Export
    | Import
    | Implements
    | Private
    | Public
    | Interface
    | Package
    | Protected
    | Static
    | Yield
    | Async
    | Await
    | From
    | As
    | Of
    | Console
    | Log
    | Alert
    ;

eos
    : SemiColon
    | EOF| 
    ;


// this is the changes that we are making to the existing grammar
//tryStatement
//    : Try block catchProduction catchHelper
//    | Try block finallyProduction catchHelper
//    ;

//
//catchHelper
//    : 
//    | catchProduction finallyProduction catchHelper
//    ;



WHITESPACE : [ \t\r\n]+ -> skip;
HashBangLine:                   '#!' ~[\r\n\u2028\u2029]*; // only allowed at start
MultiLineComment:               '/' .? '/' -> skip;
SingleLineComment:              '//' ~[\r\n\u2028\u2029]* -> skip;
RegularExpressionLiteral:       '/' RegularExpressionFirstChar RegularExpressionChar*  '/' IdentifierPart*;

OpenBracket:                    '[';
CloseBracket:                   ']';
OpenParen:                      '(';
CloseParen:                     ')';
OpenBrace:                      '{';
CloseBrace:                     '}' ;
SemiColon:                      ';';
Comma:                          ',';
Assign:                         '=';
QuestionMark:                   '?';
QuestionMarkDot:                '?.';
Colon:                          ':';
Ellipsis:                       '...';
Dot:                            '.';
PlusPlus:                       '++';
MinusMinus:                     '--';
Plus:                           '+';
Minus:                          '-';
BitNot:                         '~';
Not:                            '!';
Multiply:                       '*';
Divide:                         '/';
Modulus:                        '%';
Power:                          '**';
NullCoalesce:                   '??';
Hashtag:                        '#';
RightShiftArithmetic:           '>>';
LeftShiftArithmetic:            '<<';
RightShiftLogical:              '>>>';
LessThan:                       '<';
MoreThan:                       '>';
LessThanEquals:                 '<=';
GreaterThanEquals:              '>=';
Equals_:                        '==';
NotEquals:                      '!=';
IdentityEquals:                 '===';
IdentityNotEquals:              '!==';
BitAnd:                         '&';
BitXOr:                         '^';
BitOr:                          '|';
And:                            '&&';
Or:                             '||';
MultiplyAssign:                 '*=';
DivideAssign:                   '/=';
ModulusAssign:                  '%=';
PlusAssign:                     '+=';
MinusAssign:                    '-=';
LeftShiftArithmeticAssign:      '<<=';
RightShiftArithmeticAssign:     '>>=';
RightShiftLogicalAssign:        '>>>=';
BitAndAssign:                   '&=';
BitXorAssign:                   '^=';
BitOrAssign:                    '|=';
PowerAssign:                    '**=';
ARROW:                          '=>';
Space:							' ';
/// Null Literals

NullLiteral:                    'null';

/// Boolean Literals

BooleanLiteral:                 'true'
              |                 'false';

/// Numeric Literals

DecimalLiteral:                 DecimalIntegerLiteral '.' [0-9] [0-9_]* ExponentPart?
              |                 '.' [0-9] [0-9_]* ExponentPart?
              |                 DecimalIntegerLiteral ExponentPart?
              ;

/// Numeric Literals

HexIntegerLiteral:              '0' [xX] [0-9a-fA-F] HexDigit*;
OctalIntegerLiteral:            '0' [0-7]+;
OctalIntegerLiteral2:           '0' [oO] [0-7] [_0-7]*;
BinaryIntegerLiteral:           '0' [bB] [01] [_01]*;

BigHexIntegerLiteral:           '0' [xX] [0-9a-fA-F] HexDigit* 'n';
BigOctalIntegerLiteral:         '0' [oO] [0-7] [_0-7]* 'n';
BigBinaryIntegerLiteral:        '0' [bB] [01] [_01]* 'n';
BigDecimalIntegerLiteral:       DecimalIntegerLiteral 'n';

/// Keywords
Let:							'let';
Break:                          'break';
Do:                             'do';
Instanceof:                     'instanceof';
Typeof:                         'typeof';
Case:                           'case';
Else:                           'else';
New:                            'new';
Var:                            'var';
Catch:                          'catch';
Finally:                        'finally';
Return:                         'return';
Void:                           'void';
Continue:                       'continue';
For:                            'for';
Switch:                         'switch';
While:                          'while';
Debugger:                       'debugger';
Function_:                       'function';
This:                           'this';
With:                           'with';
Default:                        'default';
If:                             'if';
Throw:                          'throw';
Delete:                         'delete';
In:                             'in';
Try:                            'try';
As:                             'as';
From:                           'from';
Of:                             'of';

Class:                          'class';
Enum:                           'enum';
Extends:                        'extends';
Super:                          'super';
Const:                          'const';
Export:                         'export';
Import:                         'import';

Async:                          'async';
Await:                          'await';
Yield:                          'yield';

/// The following tokens are also considered to be FutureReservedWords
/// when parsing strict mode

Implements:                     'implements';
Private:                        'private' ;
Public:                         'public';
Interface:                      'interface' ;
Package:                        'package' ;
Protected:                      'protected' ;
Static:                         'static' ;

Console: 'console';
Log: 'log';  
Alert: 'alert';

/// Identifier Names and Identifiers

Identifier:                     IdentifierStart IdentifierPart*;
/// String Literals
StringLiteral:                 ('"' DoubleStringCharacter* '"'
             |                  '\'' SingleStringCharacter* '\'') 
             ;



WhiteSpaces:                    [\t\u000B\u000C\u0020\u00A0]+ ;

LineTerminator:                 [\r\n\u2028\u2029];

/// Comments


HtmlComment:                    '<!--' .*? '-->' ;
CDataComment:                   '<![CDATA[' .*? ']]>' ;
//UnexpectedCharacter:            . -> channel(ERROR);


TemplateStringStartExpression:  '${';
TemplateStringAtom:             ~[`];


//WHITESPACE : [ \t\r\n]+ -> skip;

// Fragment rules

fragment DoubleStringCharacter
    : ~["\\\r\n]
    | '\\' EscapeSequence
    | LineContinuation
    ;

fragment SingleStringCharacter
    : ~['\\\r\n]
    | '\\' EscapeSequence
    | LineContinuation
    ;

fragment EscapeSequence
    : CharacterEscapeSequence
    | '0' // no digit ahead! TODO
    | HexEscapeSequence
    | UnicodeEscapeSequence
    | ExtendedUnicodeEscapeSequence
    ;

fragment CharacterEscapeSequence
    : SingleEscapeCharacter
    | NonEscapeCharacter
    ;

fragment HexEscapeSequence
    : 'x' HexDigit HexDigit
    ;

fragment UnicodeEscapeSequence
    : 'u' HexDigit HexDigit HexDigit HexDigit
    | 'u' '{' HexDigit HexDigit+ '}'
    ;

fragment ExtendedUnicodeEscapeSequence
    : 'u' '{' HexDigit+ '}'
    ;

fragment SingleEscapeCharacter
    : ['"\\bfnrtv]
    ;

fragment NonEscapeCharacter
    : ~['"\\bfnrtv0-9xu\r\n]
    ;

fragment EscapeCharacter
    : SingleEscapeCharacter
    | [0-9]
    | [xu]
    ;

fragment LineContinuation
    : '\\' [\r\n\u2028\u2029]+
    ;

fragment HexDigit
    : [_0-9a-fA-F]
    ;

fragment DecimalIntegerLiteral
    : '0'
    | [1-9] [0-9_]*
    ;

fragment ExponentPart
    : [eE] [+-]? [0-9_]+
    ;

fragment IdentifierPart
    : IdentifierStart
    | [\p{Mn}]
    | [\p{Nd}]
    | [\p{Pc}]
    | '\u200C'
    | '\u200D'
    ;

fragment IdentifierStart
    : [\p{L}]
    | [$_]
    | '\\' UnicodeEscapeSequence
    ;

fragment RegularExpressionFirstChar
    : ~[*\r\n\u2028\u2029\\/[]
    | RegularExpressionBackslashSequence
    | '[' RegularExpressionClassChar* ']'
    ;

fragment RegularExpressionChar
    : ~[\r\n\u2028\u2029\\/[]
    | RegularExpressionBackslashSequence
    | '[' RegularExpressionClassChar* ']'
    ;

fragment RegularExpressionClassChar
    : ~[\r\n\u2028\u2029\]\\]
    | RegularExpressionBackslashSequence
    ;

fragment RegularExpressionBackslashSequence
    : '\\' ~[\r\n\u2028\u2029]
    ;