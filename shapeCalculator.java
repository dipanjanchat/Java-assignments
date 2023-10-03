//Method overloading program to calculate areas of a triangle,rectangle,circle:

import java.util.Scanner;

class shapeCalculator {
    double h, b, s1, s2, r;

    void triangle() {
        double triarea = (h * b) / 2;
        System.out.println("\nArea of the Triangle: " + triarea);
    }

    void rectangle() {
        double recarea = s1 * s2;
        System.out.println("\nArea of the Rectangle: " + recarea);
    }

    void circle() {
        double circleArea = Math.PI * (r * r);
        System.out.println("\nArea of the Circle: " + circleArea);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t -:Area Calculator:-\t\n");

        shapeCalculator calculator = new shapeCalculator();

        System.out.println("Enter height of the triangle:");
        calculator.h = sc.nextDouble();
        System.out.println("Enter the base of the triangle:");
        calculator.b = sc.nextDouble();
        calculator.triangle();

        System.out.println("Enter first side of rectangle:");
        calculator.s1 = sc.nextDouble();
        System.out.println("Enter second side of rectangle:");
        calculator.s2 = sc.nextDouble();
        calculator.rectangle();

        System.out.println("Enter radius of circle:");
        calculator.r = sc.nextDouble();
        calculator.circle();

        sc.close();
    }
}
