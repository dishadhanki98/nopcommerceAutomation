//12. Input any alphabet in uppercase and print it in lowercase

import java.util.Scanner;

public class UpperCaseLowerCase
{
    public static void main (String[] args)
    {
        Scanner uppercaselowercase = new Scanner(System.in);
        System.out.println("Enter Alphabet:");
        String alphabet = uppercaselowercase.nextLine();
        System.out.println(alphabet.toLowerCase()); //.toLowerCase converts string from Upper Case to LowerCase
    }
}
