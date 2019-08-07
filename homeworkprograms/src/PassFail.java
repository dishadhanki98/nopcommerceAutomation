//4. same as above but pass or fails on the basis of..student needs to pass all the subjects

import java.util.Scanner;

public class PassFail
{
    static double marks;

    public static void main(String[] args)
    {
        Scanner passfail = new Scanner(System.in);

        System.out.println("Please enter a name of the Student:"); //prints the message and gives user instruction
        String name = passfail.nextLine(); //asks for an input from a user
        System.out.println("Please enter Roll No:");
        int rollno = passfail.nextInt(); //using data type int user can input whole numbers
        System.out.println("Enter Marks for German");
        double german = passfail.nextDouble();
        System.out.println("Enter Marks for Maths");
        double maths = passfail.nextDouble(); //using data type double user can input either whole or decimal values
        System.out.println("Enter Marks for Psychology");
        double psychology = passfail.nextDouble();

        if ((marks = psychology + maths + german) / (3) >= 35) //condition calculates students can only pass if they...
            //...have 35 or more overall
        {
            System.out.println("Student has Passed");
        } else {
            System.out.println("Student has Failed"); //otherwise it will print student has failed

        }
    }
}
