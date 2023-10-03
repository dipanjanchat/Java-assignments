class Book
{
	String title;
	String author;
 	String isbn;
	double price;

	Book(String title, String author, String isbn, double price)
	{
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
	}

	Book(String title, String author,String isbn) 	// string-string-string combination
	{
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = 0;
	}

	Book(String title,String author, double price) 	// string-string-int combination
	{
		this.title = title;
		this.author = author;
		this.isbn = "";
		this.price = price;
	}

	Book(double price, String isbn) 				// int-string combination
	{
		this.title = "";
		this.author = "";
		this.isbn = isbn;
		this.price = price;
	}

	Book(double price) // int combination
	{
		this.title = "";
		this.author = "";
		this.isbn = "";
		this.price = price;
	}

	void display()
	{
		System.out.println("\nBook Details:-\n\n");
		System.out.println("\n\t Book Title: " + title);
		System.out.println("\n\t Author name: " + author);
		System.out.println("\n\t ISBN Number: " + isbn);
		System.out.println("\n\t Price: MRP Rs." + price + "/-");
	}

	public static void main(String[] args)
	{

		Book obj = new Book("The Man in the Iron Mask", "Alexandre Duumas", "133-92-7819", 1440);
		Book case1 = new Book("The Man in the Iron Mask", "Alexandre Dumas","133-92-7-819");
		Book case2 = new Book("The Man in the Iron Mask", "Alexandre Dumas",1440);
		Book case3 = new Book(1440,"133-92-7-819");
		Book case4 = new Book(1440);

		System.out.println("\n\t-:Original Data:-");
		obj.display();

		System.out.println("Case-I:-(string-string-string)\n");
		case1.display();

		System.out.println("Case-II:-(string-string-int combination)\n");
		case2.display();

		System.out.println("Case-III:-(string-int combination)\n");
		case3.display();

		System.out.println("Case-IV:-(int combination)");
		case4.display();

	}
}
