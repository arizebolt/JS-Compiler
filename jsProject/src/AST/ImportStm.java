package AST;

public class ImportStm implements ASTNode {
	
	public ImportStm(ASTNode t1) {
		super();
		this.t1 = t1;
	}
	ASTNode t1;
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new ImportStm( ");
		t1.print();
		System.out.println(",");
	}

}
