import java.util.Scanner;

public class CountTotalA
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type an array length here: ");
        int len = scanner.nextInt();
        String []arr = new String[len];

        int Counter = 0;

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Please enter a String: ");
            String b = scanner.next();
            for (int j = 0; j < arr.length; j++) {

                if (b.charAt(j) == 'a')
                {
                Counter++;
                }
                System.out.println("This String has: " + Counter + "a(s)");

            }

        }
    }
}
