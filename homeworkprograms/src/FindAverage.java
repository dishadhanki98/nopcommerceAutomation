//7. WAP input any five number and then find average of five numbers

import java.util.Scanner;

public class FindAverage
{
    public static void main(String[] args)
    {
        Scanner findaverage = new Scanner(System.in);
        System.out.println("Input any number:");
        double num1 = findaverage.nextDouble(); //user can input any number, even with decimals in Double data type
        System.out.println("Input any number:");
        double num2 = findaverage.nextDouble();
        System.out.println("Input any number:");
        double num3 = findaverage.nextDouble();
        System.out.println("Input any number:");
        double num4 = findaverage.nextDouble();
        System.out.println("Input any number:");
        double num5 = findaverage.nextDouble();
//Adding all five number from user input and then dividing it by 5
        System.out.println("Average of five numbers equals to:" + " " + (num1 + num2 + num3 + num4 + num5) / (5));
    }
}
