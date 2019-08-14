
public class CommonElements
{
    public static void main(String[] args)
    {
        String a[] = {"Birmingham", "London", "Leicester", "Kyoto"};
        String b[] = {"London","Canada","Leicester", "Australia", "Kyoto"};

        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < b.length; j++)
            {
                if(a[i]==b[j])
                {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
