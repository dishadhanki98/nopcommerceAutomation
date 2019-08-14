import java.util.Scanner;

public class SpecificValueScan
{
    public static void main(String[] args)
    {
        int[] c = {300, 100, 500, 1000, 40};
        System.out.print("Input values:");
        Scanner specificvalue = new Scanner(System.in);
        int x = specificvalue.nextInt();
        int i;

        for (i = 0; i < c.length; i++)
        {
            if (c[i] == x)
            {
                System.out.print(" Value matches with the values in array and positions on index: " + i);

            }
//            if (c[i] != x)
//            {
//                System.out.print("Value does not match");
//            }
        }
        if (c[i] != x)
        {
            System.out.print("Value does not match");
        }
    }
}
