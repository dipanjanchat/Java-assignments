//class Calculator with overloaded methods for addition.Create methods that can add two integers,two doubles,an integer and a double.

import java.util.Scanner;

class Calculator
{
	int a,b;
	double x,y;
	
	void addition1(int a,int b)
	{
		this.a=a;
		this.b=b;
		int result= a+b;
		System.out.println("\nSum of two integers: " +result);
	}
	
	void addition2(double x,double y)
	{
		this.x=x;
		this.y=y;
		double result= x+y;
		System.out.println("\nSum of two doubles: " +result);
	}
	
	void addition3(double x,double y,int a,int b)
	{
		this.x=x;
		this.a=a;
		double result1= (double) x+a;
		System.out.println("\nSum of 1st integer and 1st double:" +result1);
		
		this.y=y;
		this.b=b;
		double result2=(double) y+b;
		System.out.println("\nSum of 2nd integer and 2nd double:" +result2);
	}
	
	
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("\nEnter a integer:");
		int a=sc.nextInt();
		System.out.println("\nEnter a integer:");
		int b=sc.nextInt();

		System.out.println("\nEnter a double:");
		double x=sc.nextDouble();
		System.out.println("\nEnter a double:");
		double y=sc.nextDouble();

		Calculator add1=new Calculator();
		add1.addition1(a,b);

		Calculator add2=new Calculator();
		add2.addition2(x,y);
		
		Calculator add3=new Calculator();
		add3.addition3(x,y,a,b);
		
	}
}


