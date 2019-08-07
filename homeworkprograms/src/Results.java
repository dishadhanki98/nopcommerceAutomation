//3.WAP to input student name, roll no, 3 subjects marks..and find out total, percentage and result if
//he is pass or fail on basis of percentage (pass>=35) and also give them grade
//>= 80 A+
//>= 60 A
//>= 50 B
//>= 35 C

import java.util.Scanner;

public class Results {
    static double marks;

    public static void main(String[] args) {
        Scanner results = new Scanner(System.in);

        System.out.println("Please enter a name of the Student:"); //prints the message and gives user instruction
        String name = results.nextLine(); //asks for an input from a user
        System.out.println("Please enter Roll No:");
        int rollno = results.nextInt();
        System.out.println("Enter Marks for German");
        double german = results.nextDouble(); //input marks for german
        System.out.println("Enter Marks for Maths");
        double maths = results.nextDouble(); //input marks for maths
        System.out.println("Enter Marks for Psychology");
        double psychology = results.nextDouble(); //input marks for psychology

        if ((marks = psychology + maths + german) / (3)>= 80 ) //adds marks of all three subjects divides it by 3...
            //and then checks if the marks entered are greater than or equal to 80 for a student to get A+
        {
            System.out.println("Total Grade achieved:" + " " + "A+" );
        }
        else if ((marks = psychology + maths + german) / (3)>= 60) //if marks = to 60 or more student will get A
        {
            System.out.println("Total Grade achieved:" + " " + "A" );
        }
        else if ((marks = psychology + maths + german) / (3)>= 50)
        {
            System.out.println("Grade achieved:" + " " + "B");
        }
        else if ((marks = psychology + maths + german) / (3) >= 30)
        {
            System.out.println("Total Grade achieved:" + " " + "C");
        }
        //calculates percentage for student based on their grade.
        System.out.println("Total Percentage:" + " " + " " + (psychology + maths + german) / (3) + '%');
    }
}