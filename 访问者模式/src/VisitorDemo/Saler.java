package VisitorDemo;

public class Saler extends AVisitor{

	@Override
	public void visit(Apple apple) {
		// TODO Auto-generated method stub
		System.out.println("����Ա" + name + "��ƻ�����أ�Ȼ�����۸�");
	}

	@Override
	public void visit(Book book) {
		// TODO Auto-generated method stub
		System.out.println("����Ա" + name + "������ļ۸�");
	}

}
