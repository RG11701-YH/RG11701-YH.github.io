package VisitorDemo;

public class Saler extends AVisitor{

	@Override
	public void visit(Apple apple) {
		// TODO Auto-generated method stub
		System.out.println("收银员" + name + "给苹果称重，然后计算价格");
	}

	@Override
	public void visit(Book book) {
		// TODO Auto-generated method stub
		System.out.println("收银员" + name + "计算书的价格");
	}

}
