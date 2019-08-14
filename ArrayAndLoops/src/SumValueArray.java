public class SumValueArray
{
    public static void main(String[] args)
    {
        System.out.println("Printing the values");
        int[] numbersum = {300, 500, 600, 700, 800};
        int a = 0;

        for(int i = 0; i < 5; i++ )
        {
             a = a + numbersum[i];
        }

        System.out.println(a);

    }
}
