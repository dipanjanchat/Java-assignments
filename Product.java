import java.util.Scanner;

class Product {
    String productname;
    String productid;
    float price;
    int quantity;

    Product(String productname, String productid, float price, int quantity) {
        this.productname = productname;
        this.productid = productid;
        this.price = price;
        this.quantity = quantity;
    }

    float calculate() {
        return price * quantity;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of products:");
        int num = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter Details for Product " + (i + 1) + ":");
            System.out.println(".....................................\n");

            System.out.println("Enter product name:");
            String productname = sc.nextLine();

            System.out.println("Enter product ID:");
            String productid = sc.nextLine();

            System.out.println("Enter product price:");
            float price = sc.nextFloat();

            System.out.println("Enter product quantity(Pcs):");
            int quantity = sc.nextInt();

            products[i] = new Product(productname, productid, price, quantity);
            sc.nextLine();
        }

        System.out.println("\n________________________________________");
        System.out.println("\n\t---:DETAILS CHART OF ALL PRODUCT:--- ");
        System.out.println("\n****************************************");

        for (int i = 0; i < num; i++) {
            Product product = products[i];
            System.out.println("\tProduct Name: " + product.productname);
            System.out.println("\tProduct ID: " + product.productid);
            System.out.println("\tProduct Price(Rs.)" + product.price);
            System.out.println("\nProduct Quantity: " + product.quantity);
            System.out.println("\nTotal Cost: Rs." + product.calculate());
            System.out.println("\n----------------------------------------");
        }
    }
}
