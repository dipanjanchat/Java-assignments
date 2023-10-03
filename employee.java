
class employee
{
	String name; String id; String designation; int salary;
	
	employee(String name,String id,String designation,int salary)
	{
		this.name= name;
		this.id= id;
		this.designation= designation;
		this.salary= salary;
	}
	
	void display()
	{
		System.out.println("\nEmployee Details");
		System.out.println("\n--------------------\n\n");
		System.out.println("\n\t Employee Name:"+name);
		System.out.println("\n\t Employee ID:" +id);
		System.out.println("\n\t Employee Designation: " +designation);
		System.out.println("\n\t Employee Salary: " +salary);
	}
	
	public static void main(String[]args)
	{
		employee obj= new employee("Dipanjan Chatterjee","A011","Assistant Web Designer",30000);
		obj.display();
	}
}
