import java.util.Arrays;
public class EqualityTwoArrays
{
    public static void main(String[] args) {
        int a[] = {100, 200, 300, 400, 500, 600};
        int b[] = {100, 200, 300, 400, 500, 600};
        if (Arrays.equals(a, b))
        {
            System.out.println(" Arrays Match: "+Arrays.equals(a, b ));
        }
            else
                {
                System.out.println(" Arrays doesn't  Match: " +Arrays.equals(a, b ));
                }
    }}