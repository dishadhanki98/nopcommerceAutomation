//16. Write a Java program that takes the user to provide a single character from the
//        alphabet. Print Vowel or Consonant, depending on the user input.
//        For eg:
//        Input an alphabet: p
//        Expected Output :
//        Input letter is Consonant

import java.util.Scanner;

public class VowelConstant
{
    public static void main(String[] args)
    {
        Scanner vowelconstant = new Scanner(System.in);
        System.out.println("Input any character:"); //asks user to input any alphabetical character
        char vowel = vowelconstant.next().charAt(0); //allows user to input any alphabetical character
        int a=(int)vowel; //converts user's input - char data type to int data type

        //int value assigned to ASCII values will be evaluated
        //condition is declared that user can only enter values between 65 to 95 (A to Z) or 97 to 122 (a to z)
        if ((a >= 65 && a <= 95) ||( a >= 97 && a <= 122))
        {
            //nested if condition declares all the vowels
            if ((a == 'a') || (a == 'e') || (a == 'i') || (a == 'o') || (a == 'u'))
            {
                System.out.println("this is a vowel"); //if vowel condition = TRUE, it prints 'this is a vowel'
            }
         else
             {
                 //otherwise it will print, this is consonant
             System.out.println("This is consonant");
             }
        }
        else
            {
                //if user enters any numerical or symbolic value it will print invalid input
            System.out.println("Invalid Input");
            }
        }
    }