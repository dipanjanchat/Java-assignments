//Method Overriding and Inheritance: Create a class bankaccount with attributes acc_number and balance,and methods deposit(double amount) and  withdraw(double amount) to add and subtract money from balance respectively.Then create two subclasses savings and checking which inherit from bankaccount. In savings, override withdraw() with a minimum balance $100 and in checking, override withdraw() method to allow overdraft upto $100 
import java.util.Scanner;

class bankaccount {
    String acc_no;
    double balance;

    bankaccount(String acc_no, double balance) {
        this.acc_no = acc_no;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.print("Successfully deposited Rs." + amount + " to A/C " + acc_no + ". Current balance Rs." + balance);
        } else {
            System.out.println("Please enter a valid amount");
        }
    }

    void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.print("Successfully withdrew Rs." + amount + " to A/C " + acc_no + ". Current balance Rs." + balance);
        } else {
            System.out.print("Please enter a valid amount..");
        }
    }
}

class savings extends bankaccount {
    double min = 100.00;

    savings(String acc_no, double balance) {
        super(acc_no, balance);
    }

    void withdraw(double amount) {
        if (balance - amount >= min && amount > 0) {
            System.out.println("Successfully withdrew Rs." + amount + " to A/C " + acc_no + ". Current balance Rs." + balance);
        } else {
            System.out.println("Can't withdraw money. Balance is too low.");
        }
    }
}

class checking extends bankaccount {
    checking(String acc_no, double balance) {
        super(acc_no, balance);
    }

    void withdraw(double amount) {
        if (balance - amount >= -100.00) {
            balance -= amount;
            System.out.println("Successfully withdrew Rs." + amount + " to A/C " + acc_no + ". Current balance Rs." + balance);
        } else {
            System.out.println("Can't withdraw money. Overdraft exceeded.");
        }
    }
}

class myaccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        String acc_no = sc.nextLine();
        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();
        sc.nextLine();
        int choice;

        do {
			System.out.println("\n\t 1: Cash Deposit \n\t 2: Cash Withdraw \n\t 0: Exit: ");
            System.out.print("Enter choice :");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\t\t*****Cash Deposit****");
                    System.out.print("Enter amount: ");
                    double depositAmount = sc.nextDouble();
                    sc.nextLine();
                    bankaccount b = new bankaccount(acc_no, balance);
                    b.deposit(depositAmount);
                    break;

                case 2:
                    System.out.println("\t\t*****Cash Withdrawal****");
                    System.out.print("Enter amount: ");
                    double withdrawalAmount = sc.nextDouble();
                    sc.nextLine();

                    // Creating separate instances for savings and checking accounts
                    savings w1 = new savings(acc_no, balance);
                    w1.withdraw(withdrawalAmount);

                    checking w2 = new checking(acc_no, balance);
                    w2.withdraw(withdrawalAmount);
                    break;

                case 0:
                    System.out.println("\n\t*****THANK YOU VISIT AGAIN****");
					sc.nextLine();
                    break;

                default:
                    System.out.println("\t\tWrong Choice");
            }
        } while (choice != 0);

        sc.close();
    }
}
