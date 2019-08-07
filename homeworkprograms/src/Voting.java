//11. Write Java program to allow the user to input his/her age. Then the program will show if the
//person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years
//old.

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.println("Enter your age to find out whether you are eligible for voting or not:");
        int hisherage = age.nextInt(); //user inputs their age

        if (hisherage >= 18) //user are only eligible to vote if they are 18 or over!
        {
            System.out.println("You are eligible to Vote");
        } else //if user is less than 18 they are not eligible for voting
            {
            System.out.println("You are not eligible to Vote");
           }
    }
}
