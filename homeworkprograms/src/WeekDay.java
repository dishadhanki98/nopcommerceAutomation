//15. WAP input any number, the print Day name of the week accordingly by using if else
import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner weekday = new Scanner(System.in);
        System.out.println("Input any number");
        int a = weekday.nextInt();

        if (a == 1) {
            System.out.println("It's Monday");
        }
        if (a == 2) {
            System.out.println("It's Tuesday");
        }
        if (a == 3)
        {
            System.out.println("It's Wednesday");
        }
        if (a == 4)
        {
            System.out.println("It's Thursday");
        }
        if (a == 5)
        {
            System.out.println("It's Friday");
        }
        if (a == 6)
        {
            System.out.println("It's Saturday");
        }
        if (a == 7)
        {
            System.out.println("It's Sunday");
        }
    }
}
