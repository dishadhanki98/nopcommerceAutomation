import java.util.Scanner;

public class ReverseNumber
{
    public static void main (String[] args)
    {
        int n, a = 0;
        System.out.println("enter any numbers");
        Scanner reversenumber = new Scanner(System.in);
        n = reversenumber.nextInt();

        while(n!=0)
        {
            a = a * 10;
            a = a + n%10;
            n = n/10;

        }

        System.out.println("Reverse of the number is: " + a + " ");

    }

}
