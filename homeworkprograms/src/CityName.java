//10. Input any alphabet from a to f and print their city name accordingly (use if else) any other
//alphabet should be invalid entry
import java.util.Scanner;

public class CityName
{
    public static void main(String[] args)
    {
        Scanner cityname = new Scanner (System.in);
        System.out.println("Enter any alphabet from A to F");
        char x = cityname.next().charAt(0); //using char data type allows user to input character from A to F

        //user can input any small 'a' or capital 'A' and it will print city name assigned to that letter
        if(x=='a'||x=='A')
        {
            System.out.println("the city is Arizona");
        }
        else if(x=='b'||x=='B')
        {
            System.out.println("the city is Boston ");
        }
        else if(x=='c'||x=='C')
        {
            System.out.println("the city is Chicago");
        }
        else if(x=='d'||x=='D')
        {
            System.out.println("the city is Dallas");
        }
        else if(x=='e'||x=='E')
        {
            System.out.println("the city is Essex");
        }
        else if(x=='f'||x=='F')
        {
            System.out.println("the city is Florida");
        }
        else
        {
            //if user print any letter apart from the ones declared above, user will get 'invalid entry' as message
            System.out.println("invalid entry");
        }

    }
}

