import java.util.*;
public class hackerRank30
{
    public static int numberNeeded(String first, String second) 
    {   
        int c=0;
        for(int i=0;i<first.length();i++)
            {
            int t = 0;
            for(int j=0;j<second.length();j++)
                {
                if(first.charAt(i)==second.charAt(j))
                    {
                    t++;
                }
            }
            if(t==0)
                {
                c++;
                first=first.substring(i+1);
            }
        }
         for(int i=0;i<second.length();i++)
            {
            int t=0;
            for(int j=0;j<first.length();j++)
                {
                if(second.charAt(i)==first.charAt(j))
                    {
                    t++;
                }
            }
            if(t==0)
                {
                c++;
                second=second.substring(i+1);
            }
        }
         System.out.println(first);
         System.out.println(second);
      return c;
    }
  
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
