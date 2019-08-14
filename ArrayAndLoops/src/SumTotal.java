import java.util.Scanner;

public class SumTotal
{
    public static void main(String[] args)
    {
        int sum, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length");
        int len = scanner.nextInt();
        int [] arr = new int[len];

        System.out.print("Please enter Five Digits ");
        n = scanner.nextInt();

        for(sum=0; n!=0; n/=10)
        {
            //n = scanner.nextInt();
            sum+=n%10;
        }
        System.out.println("Sum of Digits " + sum);

    }
}
