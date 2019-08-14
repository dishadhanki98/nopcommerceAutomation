import java.util.Arrays;

public class SortNumericString
{
    public static void main(String[] args)
    {
        String[]country = {"Canada", "UK", "India", "Australia"};
        System.out.println("Original String" + Arrays.toString(country));
        Arrays.sort(country);
        System.out.println("Printing out sorted country" + Arrays.toString(country));

        int[]number = {200, 100, 800, 500};
        System.out.println("Original numbers" + Arrays.toString(number));
        Arrays.sort(number);
        System.out.println("Printing out sorted numbers" + Arrays.toString(number));

    }
}
