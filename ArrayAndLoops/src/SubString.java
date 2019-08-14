public class SubString
{
    public static void main (String[] args)
    {
        String word = "rapid";

        for(int i=word.length()-1;i>=0; i--)
        {
            System.out.println(word.substring(i,i + 1));
        }
    }
}
