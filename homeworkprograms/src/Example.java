import java.util.Scanner; //importing scanner to allow for user's input

public class Example //public class meaning it's accessible for anyone
{
    static int num1; //declaring variable as static in int (data type)
    static int num2; //...this means these variables can be accessed and used anywhere in the programming

    public static void main(String[] args) //essential in order for program to run
    {
        Scanner scanner = new Scanner(System.in); //creating new object for user's input and calling the imported package

        System.out.println("Enter First Number between 1 to 300:");
        num1 = scanner.nextInt(); //allows user to input number 1

        if (num1 <= 300) //condition less than or equal to 300
        {
            //depending on user's input this expression will take any number between 1 and 300
            //...and tell user whether they have entered an Odd or a Even number
            System.out.println((num1%2==0)? "This is Even number": "This is Odd number");
        }
        if (num1 > 300) //condition greater than 300
        {
            //User inputs greater than 300 then it will display the message "number is out of range"
            System.out.println("This number is out of range");
        }

        System.out.println("Enter Second Number:");
        num2 = scanner.nextInt(); //allows user to input number 2
        System.out.println((num2%2==0) ? "This is Even number" : "This is Odd number"); //ternary operator in use..
        //...to find out which condition is True and False, based on user's input


    }
}
