//2. WAP to input any year like 1989 and find out if it is leap year

import java.util.Scanner;

public class LeapYear
{
    static int year1;

    public static void main(String[] args)
    {
        Scanner leapyear = new Scanner(System.in);
        System.out.println("Please enter a year");
        year1 = leapyear.nextInt(); //allows user to input integer

        if (year1%4==0) //declaring condition using modulus to calculate Leap Year
        {
            System.out.println("This Year is a Leap Year");
        }
        else
        {
            System.out.println("This is Year is not a Leap Year");
        }


    }
}
