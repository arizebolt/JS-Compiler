package AST;

public class BlockStmList implements ASTNode {

	ASTNode t1;
	
	public BlockStmList(ASTNode t1) {
		super();
		this.t1 = t1;
	}



	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new BlockStmList( ");
		t1.print();
		System.out.println(")");
	}

}
