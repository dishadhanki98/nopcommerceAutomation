public class TransposeMatrix
{
    public static void main(String[] args)
    {
        int [][]a = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Printing out Original Matrix values ");
        for (int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a.length; j++)
            {

                System.out.print((a[i][j] + " "));
            }
            System.out.println(" ");
        }
        System.out.println("Printing out Transposed Matrix values  ");
       for(int b = 0; b < a.length; b++)
       {
           for(int c = 0; c < a.length; c++)
           {
               System.out.print((a[c][b] + " "));
           }

           System.out.println(" ");
       }

    }
}
