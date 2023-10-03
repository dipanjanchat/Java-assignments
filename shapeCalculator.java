//Method overloading program to calculate areas of a triangle,rectangle,circle:

import java.util.Scanner;

class shapeCalculator {
    double h, b, s1, s2, r;

    void triangle(double h, double b) {
        this.h = h;
        this.b = b;
        double triarea = (h * b) / 2;
        System.out.println("\nArea of the Triangle: " + triarea);
    }

    void rectangle(double s1, double s2) {
        this.s1 = s1;
        this.s2 = s2;
        double recarea = s1 * s2;
        System.out.println("\nArea of the Rectangle: " + recarea);
    }

    void circle(double r) {
        this.r = r;
        double circleArea = 4 * (r * r) * 3.1415;
        System.out.println("\nArea of the Circle: " + circleArea);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t -:Area Calculator:-\t\n");

        shapeCalculator calculator = new shapeCalculator();

        System.out.println("Enter height of the triangle:");
        double h = sc.nextDouble();
        System.out.println("Enter the base of the triangle:");
        double b = sc.nextDouble();
        calculator.triangle(h, b);

        System.out.println("Enter first side of rectangle:");
        double s1 = sc.nextDouble();
        System.out.println("Enter second side of rectangle:");
        double s2 = sc.nextDouble();
        calculator.rectangle(s1, s2);

        System.out.println("Enter radius of circle:");
        double r = sc.nextDouble();
        calculator.circle(r);

        sc.close();
    }
}