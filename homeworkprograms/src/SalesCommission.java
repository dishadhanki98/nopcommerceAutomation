//9. WAP input sales id, seller's name, sales amount, salary basic and then find this sales
//commission
//sales amount >= 50,000 35%
//sales amount >= 30,000 20%
//>= 20,000 10%
//>= 10,000 5%
//< 10,000 2%

import java.util.Scanner;

public class SalesCommission
{
    public static void main(String args[])
    {
        Scanner salescommission = new Scanner(System.in);
        System.out.println("Enter sales ID:");
        int salesid = salescommission.nextInt(); //input sales ID, data type integer
        System.out.println("Enter Seller name");
        String sellername = salescommission.next(); //input sellers name, data type String
        System.out.println("Enter sales amount");
        double salesamount = salescommission.nextDouble(); //input sales amount, data type double
        System.out.println("Enter the basic salary:" + "\n £");
        double basicsalary = salescommission.nextDouble();
        //based on the sales amount, an employer will receive commission
        if (salesamount >= 50000)
        {
            //employee will receive 35% commission if sales amount hits 50,000 or more
            System.out.println("The commision is:" + (salesamount * 35) / 100);
        } else if (salesamount >= 30000)
        {
            //employee will receive 20% if sales amount hits 30,000 or more
            System.out.println("The commission is" + (salesamount * 20) / 100);
        } else if (salesamount >= 20000)
        {
            System.out.println("The commission is"+ (salesamount*10)/100);
        }
          else if (salesamount >= 10000)
          {
            System.out.println("The commission is"+ (salesamount*5)/100);
          }
        else if (salesamount < 10000)
        {
            //employee only receives 2% if sales amount is less than 10,000
            System.out.println("The commission is"+ (salesamount*2)/100);
        }

}
}