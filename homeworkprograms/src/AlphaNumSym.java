//14. Enter any value and then find out if it is a number, symbol or an alphabet.

import java.util.Scanner;

public class AlphaNumSym
{
    public static void main(String[] args)
    {
        Scanner alphanumsym = new Scanner(System.in);
        System.out.println("Input any numerical, alphabetical or symbolic value:");
        char mix = alphanumsym.next().charAt(0); //declaring character type
        int a = (int) mix; //converting character data type to integer, for the program to read ASCII value

        if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) //declaring condition using ASCII value for Alphabet
        {
            System.out.println("You have entered an alphabetical value");
        } else if ((a >= 48 && a <= 57)) //declaring condition using ASCII value for numbers
        {
            System.out.println("You have entered a numerical value");
        }
        //declaring condition using ASCII value for symbols
        else if ((a >= 32 && a <= 47) || (a >= 58 && a <= 64) || (a >= 91 && a <= 96) || (a >= 123 && a <= 126))
        {
            System.out.println("You have entered a symbolic value");
        }

    }
}
