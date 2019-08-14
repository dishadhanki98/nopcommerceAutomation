import java.util.Scanner;

public class SpecificValue
{
    public static void main(String[] args)
    {
        int[]a = {100,400,500,300,200};
        int c = a[0];

        for(int i = 0; i < 5; i++)
        {
            if (c==a[i])
            System.out.println(a[i]);
        }

    }
}
