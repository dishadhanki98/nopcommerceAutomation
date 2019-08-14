import java.util.Scanner;

public class IndexArrayElement {
    public static void main(String[] args) {
        Scanner index = new Scanner(System.in);
        System.out.println("Elements from an Array");
        int c = index.nextInt();
        int arr[] = {200, 300, 400, 500, 600};

        for (int a = 0; a < 5; a++)
        {
            if (c == arr[a])
            {
                System.out.println("Position of this element is: " + a);
            }

        }

    }

}