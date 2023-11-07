
import java.util.Scanner;
class Animal
{
	String name;
	Animal(String name)
	{
		this.name=name;
	}
	void makesound()
	{
		System.out.println("\nThis is a " +name);
	}
}
class Dog extends Animal
{
	Dog(String name)
	{
		super(name);
	}
	void makesound()
	{
		System.out.println("Generic sound: bark,howl,whimper,whine,yelp,growl.....");
	}
}
class Cat extends Animal
{
	Cat(String name)
	{
		super(name);
	}
	void makesound()
	{
		System.out.println("Generic Sound: meow,purr.....");
	}
}
class animal_sound
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("\n  Enter name:");
	String name=sc.nextLine();
	sc.close();
	if(name.equals("Dog"))
	{
	Dog d=new Dog(name);
	d.makesound();
	}
	else if(name.equals("Cat"))
	{
		Cat c=new Cat(name);
		c.makesound();
	}
	else
	{
		System.out.println("Don't know...");
	}	
	}
}