import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args)
    {
        int i;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int a = scanner.nextInt();

        int [] b = new int[a];
        for(i = 0; i < b.length; i++)
        {
            System.out.println("Enter any 5 Digit number");
            int input = scanner.nextInt();
            sum = sum + input;

            if(input%2==0)
            {
                System.out.println("number is even");
            }
            else if(input%2!=0)
            {
                System.out.println("number is odd ");
            }

        }
       System.out.println("Total sum is: " + sum);

    }

}
