package TemplateMethodDemo;

public class DefIntegralXX extends ADefiniteIntegral {
	
	private double a,b;
	private int c;
	
	public DefIntegralXX(double a,double b,int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	protected double getA() {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	protected double getB() {
		// TODO Auto-generated method stub
		return b;
	}

	@Override
	protected int getC() {
		// TODO Auto-generated method stub
		return c;
	}

	@Override
	protected double function(double x) {
		// TODO Auto-generated method stub
		return x;
	}

}
