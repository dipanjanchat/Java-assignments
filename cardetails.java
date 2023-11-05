//Method overriding: create a class called vehicle with attributes brand and year, and a method displayinfo() that prints the brand and year of the vehicle. Then create a subclass called Car that inherits from Vehicle and adds an attribute numDoors.Override displayinfo() method in the Carr class to include the number of doors in the output.

class vehicle{
	String brand;
	int year;	
	
	public vehicle(String brand,int year){
		this.brand=brand;
		this.year=year;
	}
	
	void displayinfo(){
		System.out.println("\n Car Brand: " + brand);
		System.out.println(" Year of manufacture: " + year);
	}
}

class car extends vehicle{
	int numdoors;
	
	public car(String brand,int year,int numdoors){
		super(brand,year);
		this.numdoors=numdoors;
	}
	@Override
	void displayinfo(){
		System.out.println(" Number of Doors:" +numdoors);
	}
}

class cardetails{
	
	public static void main(String[] args)
	{
		System.out.println("\t********CAR DETAILS********\n");
		vehicle v=new vehicle("Scorpio",2023);
		v.displayinfo();
		car c=new car("Scorpio",2023,8);
		c.displayinfo();
	}
}
