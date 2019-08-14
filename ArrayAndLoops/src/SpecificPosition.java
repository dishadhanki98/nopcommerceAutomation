import java.util.Scanner;

public class SpecificPosition {
    public static void main(String[] args) {
        Scanner pos = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Insert an element into an array");
            int x = pos.nextInt();
            //for ()
            System.out.println("Insert an index: " + i);
            int b = pos.nextInt();
            int c = arr[i];
        }

    }
}
