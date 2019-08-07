//8. WAP to input any number and fid our if it is positive , negative or zero

import java.util.Scanner;

public class PositiveNegativeZero
{
    public static void main (String[] args)
    {
        Scanner positivenegativezero = new Scanner(System.in);
        System.out.println("Input any number to find out if it is Positive, Negative or Zero");
        int number = positivenegativezero.nextInt();

        if (number >= 1) //condition for positive number more than or equal to 1
        {
            System.out.println("The number you have entered is Positive");
        }
        else if (number <= -1) //condition for negative number less than or equal to -1
        {
            System.out.println("The number you have entered is Negative");
        }
        else
        {
            System.out.println("The number you have entered is Zero"); //otherwise prints 0
        }


    }
}
