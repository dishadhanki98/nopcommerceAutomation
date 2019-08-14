import java.util.Scanner;

public class TotalNumberSpace
{
    public static void main(String[] args)
    {
        Scanner numberspace = new Scanner(System.in);
        System.out.println("Please enter the length here: ");
        int length = numberspace.nextInt();

        char []a = new char[length];
        int count = 0;

        for (int i = 0; i < a.length; i++)
        {
            System.out.println("Write here: ");
            String b = numberspace.next();

            for( int j = 0; j < a.length; j++)
            {
                if(b.charAt(j)=='a')
                {
                    count++;
                    System.out.println("Total words" + count + " ");
                }
            }

        }

    }
}
