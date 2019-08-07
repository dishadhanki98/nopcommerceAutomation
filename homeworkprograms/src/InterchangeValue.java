//5. WAP to input any two numbers and then print their interchanged value

import java.util.Scanner;

public class InterchangeValue
{
    public static void main(String[] args)
    {
        Scanner interchangevalue = new Scanner(System.in);
        System.out.println("Please Input the first number");
        int a = interchangevalue.nextInt();
        System.out.println("Please Input the second number:");
        int b = interchangevalue.nextInt();
        System.out.println("Before Swapping: \na="  +a+ "\n AND \nb=" +b); //prints out values before interchanging

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Values Swapped: \na=" + a + "\n AND \nb=" +b); //swaps or interchanges the value of a and b..
        //..and prints the interchanged values.

    }
}
