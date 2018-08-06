import java.io.*;
import java.util.*;
public class hackerRank4
{
    public static void main(String argsp[]) throws Exception
    {
       //  BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         for(int i=0;i<a;i++)
         {
            String s=sc.next();
            // String ns=arrange(s.trim());
         //   arrange(s);
            System.out.println(s);
            int d=count(s);
            System.out.println(d);              
         }
    }
     public static int count(String s)
    {
       int l=0,i,j;
       char ch;
       System.out.println(s.length());
       for(i=0;i<s.length()-1;i++)
        {
            ch=s.charAt(i);
            for(j=i+1;j<s.length();j++)
            {
               char ch1=s.charAt(j);
               if(ch==ch1)
               {
                   i++;
                   j++;
               }
               else if(ch!=ch1)
               {
                   l++;
               }
            }
        }
       return l;
    }
   /*  
    public static String arrange(String str)
    {
         char[] charArray = str.toCharArray();
         Arrays.sort(charArray);
         String nstr = new String(charArray);
         return nstr;
    }   
*/
}
