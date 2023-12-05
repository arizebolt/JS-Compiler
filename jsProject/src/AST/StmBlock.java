package AST;

public class StmBlock implements ASTNode {

	ASTNode t1;
	
	public StmBlock(ASTNode t1) {
		super();
		this.t1 = t1;
	}



	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new StmBlock( ");
		t1.print();
		System.out.println(")");
	}

}
