package VisitorDemo;

public class Apple implements IProduct{

	@Override
	public void accepte(AVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
