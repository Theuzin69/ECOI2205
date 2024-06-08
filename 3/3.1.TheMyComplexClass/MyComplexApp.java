import java.util.Scanner;

public class MyComplexApp {
    public  static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter complex number 1 (real and imaginary part): ");
        MyComplex number1 = new MyComplex(scan.nextDouble(), scan.nextDouble());

        System.out.println("Enter complex number 2 (real and imaginary part): ");
        MyComplex number2 = new MyComplex(scan.nextDouble(), scan.nextDouble());

        System.out.println("Number 1 is: " + number1);
        if(!number1.isReal()) {
            System.out.println(number1 + " is NOT a pure real number");
        } else
            System.out.println(number1 + " is a pure real number");
        if(!number1.isImaginary()) {
            System.out.println(number1 + " is NOT a pure imaginary number");
        } else
            System.out.println(number1 + " is a pure imaginary number");


        System.out.println("Number 2 is: " + number2);
        if(!number2.isReal()) {
            System.out.println(number2 + " is NOT a pure real number");
        } else
            System.out.println(number2 + " is a pure real number");
        if(!number2.isImaginary()) {
            System.out.println(number2 + " is NOT a pure imaginary number");
        } else
            System.out.println(number2 + " is a pure imaginary number");

        if(!number1.equals(number2)) {
            System.out.println(number1 + " is NOT equal to " + number2);
        } else
            System.out.println(number1 + " is equal to " + number2);

        System.out.println(number1 + " + " + number2 + " = "
                + number1.addNew(number2));
    }
}
