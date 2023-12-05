// Generated from hello.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link helloParser}.
 */
public interface helloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link helloParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(helloParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(helloParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void enterSourceElement(helloParser.SourceElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void exitSourceElement(helloParser.SourceElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(helloParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(helloParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(helloParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(helloParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(helloParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(helloParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(helloParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(helloParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void enterImportFromBlock(helloParser.ImportFromBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void exitImportFromBlock(helloParser.ImportFromBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#importModuleItems}.
	 * @param ctx the parse tree
	 */
	void enterImportModuleItems(helloParser.ImportModuleItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#importModuleItems}.
	 * @param ctx the parse tree
	 */
	void exitImportModuleItems(helloParser.ImportModuleItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#b}.
	 * @param ctx the parse tree
	 */
	void enterB(helloParser.BContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#b}.
	 * @param ctx the parse tree
	 */
	void exitB(helloParser.BContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#c}.
	 * @param ctx the parse tree
	 */
	void enterC(helloParser.CContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#c}.
	 * @param ctx the parse tree
	 */
	void exitC(helloParser.CContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#importAliasName}.
	 * @param ctx the parse tree
	 */
	void enterImportAliasName(helloParser.ImportAliasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#importAliasName}.
	 * @param ctx the parse tree
	 */
	void exitImportAliasName(helloParser.ImportAliasNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#moduleExportName}.
	 * @param ctx the parse tree
	 */
	void enterModuleExportName(helloParser.ModuleExportNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#moduleExportName}.
	 * @param ctx the parse tree
	 */
	void exitModuleExportName(helloParser.ModuleExportNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#importedBinding}.
	 * @param ctx the parse tree
	 */
	void enterImportedBinding(helloParser.ImportedBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#importedBinding}.
	 * @param ctx the parse tree
	 */
	void exitImportedBinding(helloParser.ImportedBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#importDefault}.
	 * @param ctx the parse tree
	 */
	void enterImportDefault(helloParser.ImportDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#importDefault}.
	 * @param ctx the parse tree
	 */
	void exitImportDefault(helloParser.ImportDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#importNamespace}.
	 * @param ctx the parse tree
	 */
	void enterImportNamespace(helloParser.ImportNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#importNamespace}.
	 * @param ctx the parse tree
	 */
	void exitImportNamespace(helloParser.ImportNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#importFrom}.
	 * @param ctx the parse tree
	 */
	void enterImportFrom(helloParser.ImportFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#importFrom}.
	 * @param ctx the parse tree
	 */
	void exitImportFrom(helloParser.ImportFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void enterAliasName(helloParser.AliasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void exitAliasName(helloParser.AliasNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportDeclaration}
	 * labeled alternative in {@link helloParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportDeclaration(helloParser.ExportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportDeclaration}
	 * labeled alternative in {@link helloParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportDeclaration(helloParser.ExportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportDefaultDeclaration}
	 * labeled alternative in {@link helloParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportDefaultDeclaration(helloParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportDefaultDeclaration}
	 * labeled alternative in {@link helloParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportDefaultDeclaration(helloParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#exportFromBlock}.
	 * @param ctx the parse tree
	 */
	void enterExportFromBlock(helloParser.ExportFromBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#exportFromBlock}.
	 * @param ctx the parse tree
	 */
	void exitExportFromBlock(helloParser.ExportFromBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#exportModuleItems}.
	 * @param ctx the parse tree
	 */
	void enterExportModuleItems(helloParser.ExportModuleItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#exportModuleItems}.
	 * @param ctx the parse tree
	 */
	void exitExportModuleItems(helloParser.ExportModuleItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#d}.
	 * @param ctx the parse tree
	 */
	void enterD(helloParser.DContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#d}.
	 * @param ctx the parse tree
	 */
	void exitD(helloParser.DContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(helloParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(helloParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#exportAliasName}.
	 * @param ctx the parse tree
	 */
	void enterExportAliasName(helloParser.ExportAliasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#exportAliasName}.
	 * @param ctx the parse tree
	 */
	void exitExportAliasName(helloParser.ExportAliasNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(helloParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(helloParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(helloParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(helloParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void enterCatchProduction(helloParser.CatchProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void exitCatchProduction(helloParser.CatchProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#catchHelper}.
	 * @param ctx the parse tree
	 */
	void enterCatchHelper(helloParser.CatchHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#catchHelper}.
	 * @param ctx the parse tree
	 */
	void exitCatchHelper(helloParser.CatchHelperContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(helloParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(helloParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(helloParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(helloParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(helloParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(helloParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(helloParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(helloParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement_(helloParser.EmptyStatement_Context ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement_(helloParser.EmptyStatement_Context ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(helloParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(helloParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(helloParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(helloParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(helloParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(helloParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(helloParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(helloParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#nonTerminal1}.
	 * @param ctx the parse tree
	 */
	void enterNonTerminal1(helloParser.NonTerminal1Context ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#nonTerminal1}.
	 * @param ctx the parse tree
	 */
	void exitNonTerminal1(helloParser.NonTerminal1Context ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#nonTerminal2}.
	 * @param ctx the parse tree
	 */
	void enterNonTerminal2(helloParser.NonTerminal2Context ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#nonTerminal2}.
	 * @param ctx the parse tree
	 */
	void exitNonTerminal2(helloParser.NonTerminal2Context ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void enterVarModifier(helloParser.VarModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void exitVarModifier(helloParser.VarModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(helloParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(helloParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(helloParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(helloParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(helloParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(helloParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#yieldStatement}.
	 * @param ctx the parse tree
	 */
	void enterYieldStatement(helloParser.YieldStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#yieldStatement}.
	 * @param ctx the parse tree
	 */
	void exitYieldStatement(helloParser.YieldStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void enterWithStatement(helloParser.WithStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void exitWithStatement(helloParser.WithStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(helloParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(helloParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(helloParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(helloParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void enterCaseClauses(helloParser.CaseClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void exitCaseClauses(helloParser.CaseClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#g}.
	 * @param ctx the parse tree
	 */
	void enterG(helloParser.GContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#g}.
	 * @param ctx the parse tree
	 */
	void exitG(helloParser.GContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(helloParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(helloParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClause(helloParser.DefaultClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClause(helloParser.DefaultClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#defaultHelper}.
	 * @param ctx the parse tree
	 */
	void enterDefaultHelper(helloParser.DefaultHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#defaultHelper}.
	 * @param ctx the parse tree
	 */
	void exitDefaultHelper(helloParser.DefaultHelperContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabelledStatement(helloParser.LabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabelledStatement(helloParser.LabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(helloParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(helloParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void enterFinallyProduction(helloParser.FinallyProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void exitFinallyProduction(helloParser.FinallyProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	void enterDebuggerStatement(helloParser.DebuggerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	void exitDebuggerStatement(helloParser.DebuggerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(helloParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(helloParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#async}.
	 * @param ctx the parse tree
	 */
	void enterAsync(helloParser.AsyncContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#async}.
	 * @param ctx the parse tree
	 */
	void exitAsync(helloParser.AsyncContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#star}.
	 * @param ctx the parse tree
	 */
	void enterStar(helloParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#star}.
	 * @param ctx the parse tree
	 */
	void exitStar(helloParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#formalParListHelp}.
	 * @param ctx the parse tree
	 */
	void enterFormalParListHelp(helloParser.FormalParListHelpContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#formalParListHelp}.
	 * @param ctx the parse tree
	 */
	void exitFormalParListHelp(helloParser.FormalParListHelpContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#classHelper}.
	 * @param ctx the parse tree
	 */
	void enterClassHelper(helloParser.ClassHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#classHelper}.
	 * @param ctx the parse tree
	 */
	void exitClassHelper(helloParser.ClassHelperContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#classElHelper}.
	 * @param ctx the parse tree
	 */
	void enterClassElHelper(helloParser.ClassElHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#classElHelper}.
	 * @param ctx the parse tree
	 */
	void exitClassElHelper(helloParser.ClassElHelperContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(helloParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(helloParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#classTail}.
	 * @param ctx the parse tree
	 */
	void enterClassTail(helloParser.ClassTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#classTail}.
	 * @param ctx the parse tree
	 */
	void exitClassTail(helloParser.ClassTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#classHeritage}.
	 * @param ctx the parse tree
	 */
	void enterClassHeritage(helloParser.ClassHeritageContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#classHeritage}.
	 * @param ctx the parse tree
	 */
	void exitClassHeritage(helloParser.ClassHeritageContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(helloParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(helloParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#classElementList}.
	 * @param ctx the parse tree
	 */
	void enterClassElementList(helloParser.ClassElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#classElementList}.
	 * @param ctx the parse tree
	 */
	void exitClassElementList(helloParser.ClassElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#classElement}.
	 * @param ctx the parse tree
	 */
	void enterClassElement(helloParser.ClassElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#classElement}.
	 * @param ctx the parse tree
	 */
	void exitClassElement(helloParser.ClassElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#statOrId}.
	 * @param ctx the parse tree
	 */
	void enterStatOrId(helloParser.StatOrIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#statOrId}.
	 * @param ctx the parse tree
	 */
	void exitStatOrId(helloParser.StatOrIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#statOrIdHelper}.
	 * @param ctx the parse tree
	 */
	void enterStatOrIdHelper(helloParser.StatOrIdHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#statOrIdHelper}.
	 * @param ctx the parse tree
	 */
	void exitStatOrIdHelper(helloParser.StatOrIdHelperContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMethodDefinition(helloParser.MethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMethodDefinition(helloParser.MethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFieldDefinition(helloParser.FieldDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFieldDefinition(helloParser.FieldDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#classElementName}.
	 * @param ctx the parse tree
	 */
	void enterClassElementName(helloParser.ClassElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#classElementName}.
	 * @param ctx the parse tree
	 */
	void exitClassElementName(helloParser.ClassElementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#privateIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterPrivateIdentifier(helloParser.PrivateIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#privateIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitPrivateIdentifier(helloParser.PrivateIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(helloParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(helloParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#formalParameterArgHelper}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterArgHelper(helloParser.FormalParameterArgHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#formalParameterArgHelper}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterArgHelper(helloParser.FormalParameterArgHelperContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#lastFormalParameterArgHelper}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameterArgHelper(helloParser.LastFormalParameterArgHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#lastFormalParameterArgHelper}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameterArgHelper(helloParser.LastFormalParameterArgHelperContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterArg(helloParser.FormalParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterArg(helloParser.FormalParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#singleExpressionHelper}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpressionHelper(helloParser.SingleExpressionHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#singleExpressionHelper}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpressionHelper(helloParser.SingleExpressionHelperContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameterArg(helloParser.LastFormalParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameterArg(helloParser.LastFormalParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(helloParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(helloParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#sourceElementsHelper}.
	 * @param ctx the parse tree
	 */
	void enterSourceElementsHelper(helloParser.SourceElementsHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#sourceElementsHelper}.
	 * @param ctx the parse tree
	 */
	void exitSourceElementsHelper(helloParser.SourceElementsHelperContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void enterSourceElements(helloParser.SourceElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void exitSourceElements(helloParser.SourceElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(helloParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(helloParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(helloParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(helloParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(helloParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(helloParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#arrayElementHelper}.
	 * @param ctx the parse tree
	 */
	void enterArrayElementHelper(helloParser.ArrayElementHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#arrayElementHelper}.
	 * @param ctx the parse tree
	 */
	void exitArrayElementHelper(helloParser.ArrayElementHelperContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#elementListHelper}.
	 * @param ctx the parse tree
	 */
	void enterElementListHelper(helloParser.ElementListHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#elementListHelper}.
	 * @param ctx the parse tree
	 */
	void exitElementListHelper(helloParser.ElementListHelperContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(helloParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(helloParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#ellipsis}.
	 * @param ctx the parse tree
	 */
	void enterEllipsis(helloParser.EllipsisContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#ellipsis}.
	 * @param ctx the parse tree
	 */
	void exitEllipsis(helloParser.EllipsisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link helloParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyExpressionAssignment(helloParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link helloParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyExpressionAssignment(helloParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link helloParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterComputedPropertyExpressionAssignment(helloParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link helloParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitComputedPropertyExpressionAssignment(helloParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionProperty}
	 * labeled alternative in {@link helloParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterFunctionProperty(helloParser.FunctionPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionProperty}
	 * labeled alternative in {@link helloParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitFunctionProperty(helloParser.FunctionPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link helloParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyGetter(helloParser.PropertyGetterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link helloParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyGetter(helloParser.PropertyGetterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link helloParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertySetter(helloParser.PropertySetterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link helloParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertySetter(helloParser.PropertySetterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link helloParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyShorthand(helloParser.PropertyShorthandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link helloParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyShorthand(helloParser.PropertyShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#consoleStatement}.
	 * @param ctx the parse tree
	 */
	void enterConsoleStatement(helloParser.ConsoleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#consoleStatement}.
	 * @param ctx the parse tree
	 */
	void exitConsoleStatement(helloParser.ConsoleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#alertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlertStatement(helloParser.AlertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#alertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlertStatement(helloParser.AlertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(helloParser.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(helloParser.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(helloParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(helloParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#argumentsRepeatHelper}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsRepeatHelper(helloParser.ArgumentsRepeatHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#argumentsRepeatHelper}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsRepeatHelper(helloParser.ArgumentsRepeatHelperContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#argumentsHelper}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsHelper(helloParser.ArgumentsHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#argumentsHelper}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsHelper(helloParser.ArgumentsHelperContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(helloParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(helloParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSequence(helloParser.ExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSequence(helloParser.ExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#expressionSequenceHelper}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSequenceHelper(helloParser.ExpressionSequenceHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#expressionSequenceHelper}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSequenceHelper(helloParser.ExpressionSequenceHelperContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#either}.
	 * @param ctx the parse tree
	 */
	void enterEither(helloParser.EitherContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#either}.
	 * @param ctx the parse tree
	 */
	void exitEither(helloParser.EitherContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#hash}.
	 * @param ctx the parse tree
	 */
	void enterHash(helloParser.HashContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#hash}.
	 * @param ctx the parse tree
	 */
	void exitHash(helloParser.HashContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#identifierHelper}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierHelper(helloParser.IdentifierHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#identifierHelper}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierHelper(helloParser.IdentifierHelperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(helloParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(helloParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(helloParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(helloParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(helloParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(helloParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(helloParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(helloParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralExpression(helloParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralExpression(helloParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MetaExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMetaExpression(helloParser.MetaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MetaExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMetaExpression(helloParser.MetaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(helloParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(helloParser.InExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(helloParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(helloParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OptionalChainExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterOptionalChainExpression(helloParser.OptionalChainExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OptionalChainExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitOptionalChainExpression(helloParser.OptionalChainExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(helloParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(helloParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecreaseExpression(helloParser.PreDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecreaseExpression(helloParser.PreDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsExpression(helloParser.ArgumentsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsExpression(helloParser.ArgumentsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AwaitExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAwaitExpression(helloParser.AwaitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AwaitExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAwaitExpression(helloParser.AwaitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(helloParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(helloParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(helloParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(helloParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(helloParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(helloParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(helloParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(helloParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecreaseExpression(helloParser.PostDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecreaseExpression(helloParser.PostDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeofExpression(helloParser.TypeofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeofExpression(helloParser.TypeofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceofExpression(helloParser.InstanceofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceofExpression(helloParser.InstanceofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlusExpression(helloParser.UnaryPlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlusExpression(helloParser.UnaryPlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterDeleteExpression(helloParser.DeleteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitDeleteExpression(helloParser.DeleteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterImportExpression(helloParser.ImportExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitImportExpression(helloParser.ImportExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(helloParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(helloParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitXOrExpression(helloParser.BitXOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitXOrExpression(helloParser.BitXOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuperExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperExpression(helloParser.SuperExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuperExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperExpression(helloParser.SuperExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(helloParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(helloParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitShiftExpression(helloParser.BitShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitShiftExpression(helloParser.BitShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(helloParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(helloParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(helloParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(helloParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(helloParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(helloParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(helloParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(helloParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code YieldExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterYieldExpression(helloParser.YieldExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code YieldExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitYieldExpression(helloParser.YieldExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitNotExpression(helloParser.BitNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitNotExpression(helloParser.BitNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(helloParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(helloParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(helloParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(helloParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralExpression(helloParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralExpression(helloParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberDotExpression(helloParser.MemberDotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberDotExpression(helloParser.MemberDotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassExpression(helloParser.ClassExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassExpression(helloParser.ClassExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberIndexExpression(helloParser.MemberIndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberIndexExpression(helloParser.MemberIndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(helloParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(helloParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitAndExpression(helloParser.BitAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitAndExpression(helloParser.BitAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitOrExpression(helloParser.BitOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitOrExpression(helloParser.BitOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperatorExpression(helloParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperatorExpression(helloParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterVoidExpression(helloParser.VoidExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitVoidExpression(helloParser.VoidExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CoalesceExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterCoalesceExpression(helloParser.CoalesceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CoalesceExpression}
	 * labeled alternative in {@link helloParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitCoalesceExpression(helloParser.CoalesceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(helloParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(helloParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterAssignable(helloParser.AssignableContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitAssignable(helloParser.AssignableContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(helloParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(helloParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#propertyAssignmentHelper}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssignmentHelper(helloParser.PropertyAssignmentHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#propertyAssignmentHelper}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssignmentHelper(helloParser.PropertyAssignmentHelperContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#objectLiteralHelper}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralHelper(helloParser.ObjectLiteralHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#objectLiteralHelper}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralHelper(helloParser.ObjectLiteralHelperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnonymousFunctionDecl}
	 * labeled alternative in {@link helloParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousFunctionDecl(helloParser.AnonymousFunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnonymousFunctionDecl}
	 * labeled alternative in {@link helloParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousFunctionDecl(helloParser.AnonymousFunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link helloParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(helloParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link helloParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(helloParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionParameters(helloParser.ArrowFunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionParameters(helloParser.ArrowFunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionBody(helloParser.ArrowFunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionBody(helloParser.ArrowFunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(helloParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(helloParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(helloParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(helloParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(helloParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(helloParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#bigintLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBigintLiteral(helloParser.BigintLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#bigintLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBigintLiteral(helloParser.BigintLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(helloParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(helloParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(helloParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(helloParser.SetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierName(helloParser.IdentifierNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierName(helloParser.IdentifierNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(helloParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(helloParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void enterReservedWord(helloParser.ReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void exitReservedWord(helloParser.ReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(helloParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(helloParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(helloParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(helloParser.EosContext ctx);
}