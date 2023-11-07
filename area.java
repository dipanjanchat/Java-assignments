//Method overriding: Create a class called Shape with a method calculatearea() that returns 0. Create two subclasses circle and rectangle which inherit from shape. Implement calculatearea() method in each subclass to compute the area of the respective shape.

import java.util.Scanner;

class Shape 
{
    float rad;
    float length; float width;
	
	Shape(float rad,float length,float width)
	{
		this.rad=rad;
		this.length=length;
		this.width=width;
	}
	
	void calculateArea()
	{
	}
}

class circle extends Shape
{
	
	public circle(float rad,float length, float width)
	{
		super(rad,0,0);
	}
	//@Override
	void calculateArea()
	{
		double cirarea=(rad*rad)*Math.PI;
		System.out.println("\n\t Area of Circle: " +cirarea);
	}
}

class rectangle extends Shape
{
	
	public rectangle(float rad, float length, float width)
	{
		super(0,length,width);
	}
	//@Override
	void calculateArea()
	{
		double recarea=(length*width);
		System.out.println("\n\t Area of Rectangle:" +recarea);
	}
}

class area
{
	public static void main(String[] args)
	{		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\t -:Area Calculator:-\t\n");
		System.out.println("\t***********************************\n");
		System.out.println("Enter radius of circle:");
		float rad=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter length of Rectangle:");	
		float length=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter width of Rectangle:");
		float width=sc.nextFloat();
		sc.nextLine();
		
		circle cir=new circle(rad,length,width);
		cir.calculateArea();
		rectangle rec=new rectangle(rad,length,width);
		rec.calculateArea();
		
		sc.close();
	}
};