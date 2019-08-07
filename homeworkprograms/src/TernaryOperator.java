//1. Input any two number and find out its odd or even use ternary operator (? :)

import java.util.Scanner; //importing Scanner package

public class TernaryOperator
{
    static int num1; //declaring int data type
    static int num2;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter First Number:");
        num1 = scanner.nextInt(); //asks for user's input
        //modulus operator (%) is used in calculation to find out number is Even or Odd
        System.out.println((num1%2==0) ? "This number is Even" : "This number is Odd");

        System.out.println("Enter Second Number:");
        num2 = scanner.nextInt();
        //using ternary operator (?:), looks at which condition is true and false
        System.out.println((num2%2==0) ? "This number is Even" : "This number is Odd");

    }
}
