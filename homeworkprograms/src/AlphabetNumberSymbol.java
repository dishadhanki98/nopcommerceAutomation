//14. Enter any value and then find out if it is a number, symbol or an alphabet.

import java.util.Scanner; //importing scanner to allow for user's input

public class AlphabetNumberSymbol //giving class a name
{
    public static void main(String[] args) //main method
    {
        Scanner asn = new Scanner(System.in); //creating object and importing user input package
        System.out.println("Please enter any letter, number or symbol:");
        char a = asn.next().charAt(0); //inputs character

        if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) //following condition allows user to input
            // Capital and small letters from the alphabet

        {
            System.out.println("You have entered a letter from an alphabet");
        }
        else if ((a >= '0' && a <= '9')) //following condition allows user to input numbers between 0 and 9
        {
            System.out.println("You have entered a number");
        }
        else
            {
                System.out.println("You have entered a symbol");
            }
    }
}
