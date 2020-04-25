package TemplateMethodDemo;

public abstract class ADefiniteIntegral {
	
	protected abstract double getA(); //下限
	
	protected abstract double getB(); //上限
	
	protected abstract int getC(); //切分单元格
	
	protected abstract double function(double x); //积分函数
	
	public final double CalDefiniteIntegral() {
		double a=0,b=0,t=0,sum=0;
		
		int c = 0;
		
		a=getA();
		b=getB();
		c=getC();
		
		if(a > b) {
			t=a;
			a=b;
			b=t;
		}
		
		t = (b-a)/(double)c;
		
		for(int i=0;i<c;i++) {
			sum = sum+t*function(a+i*t);
		}
		
		return sum;
	}
}
