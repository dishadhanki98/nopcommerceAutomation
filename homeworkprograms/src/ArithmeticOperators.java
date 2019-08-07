//13.WAP to input enter any two number and ask user to enter their symbol (+, -, /, *) find addition,
//subtraction, multiplication and division according to their symbol (using if else)

import java.util.Scanner;

public class ArithmeticOperators
{

    public static void main(String[] args)
    {
        Scanner arthimeticoperators = new Scanner(System.in);
        System.out.println("Please input first number:");
        int num1 = arthimeticoperators.nextInt();
        System.out.println("Please input second number:");
        int num2 = arthimeticoperators.nextInt();
        System.out.println("Please choose any arithmetic operator:");
        char a = arthimeticoperators.next().charAt(0);

        if (a == '+')
        {
            System.out.println("Addition of two numbers equals to" + " " + (num1 + num2));
        }
        else if (a == '-')
        {
            System.out.println("Subtraction of two numbers equals to" + " " + (num1 - num2));
        }
        else if (a == '/')
        {
            System.out.println("Division of two numbers equals to" + " " + (num1 / num2));
        }
        else if (a == '*')
        {
            System.out.println("Multiplication of two numbers equals to" + " " + (num1 * num2));
        }
        else
        {
            System.out.println("invalid input");
        }
    }
}