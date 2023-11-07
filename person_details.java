//Method overriding and Inheritance: Create a class called person with attributes name,age and a method displayinfo() which prints the name and age of the person.Then create a subclass called Student that inherits person and adds attributes studentid,college,department.Override displayinfo() in student subclass to include student details in the details.

import java.util.Scanner;

class Person
{
	String name;
	int age;
	Person(String name,int age)		//constructor of Person class
	{
		this.name=name;
		this.age=age;
	}
	void displayinfo()
	{
		System.out.println("\n\tName: " +name);
		System.out.println("\tAge: " +age);
	}
}
class Student extends Person
{
	String studentid; String department; String college;
	Student(String name,int age,String studentid, String department, String college)							//constructor of Student class
	{
		super(name,age);
		this.studentid=studentid;
		this.department=department;
		this.college=college;
	}
	Person p=new Person(name,age);
	void displayinfo()
	{
		System.out.print("\n\n\t******STUDENT DETAILS********\n\t");
		p.displayinfo();
		System.out.println("\tStudent I.D. " +studentid);
		System.out.println("\tCollege: " +college);
		System.out.println("\tDepartment of Student: " +department);
	}
	
}
class person_details
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name of the student:");
		String name =sc.nextLine();
		System.out.print("Enter age:");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter student I.D.");
		String studentid=sc.nextLine();
		System.out.print("Enter department of the student:");
		String college=sc.nextLine();
		System.out.print("Enter name of the College:");
		String department=sc.nextLine();
		sc.close();
		Student s=new Student(name,age,studentid,department,college);
		s.displayinfo();
		
	}
}