import java.io.*;
import java.util.*;

class deyyyy
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader st=new BufferedReader(new InputStreamReader(System.in));
        int c=0,i,j;
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
       String s=st.readLine();
       
     //   String s=sc.next();
//        System.out.println(count(s));
      
        for(i=0;i<=s.length();i++)
        {
            for(j=i+1;j<=s.length();j++)
            {
              String  t=s.substring(i,j);
            //a  System.out.print(t.length());
              String ns=arrange(t);
              int r=count(ns);
             // System.out.println(t);
             // System.out.println(r);  
                if(r==k)
                {
                    c++;
                }
            }
        } 
        System.out.println(c); 
    }
    public static int count(String s)
    {
       int l=0,i,j;
       char ch;
       for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i) ;
            for(j=i+1;j<s.length();j++)
            {
               char ch1=s.charAt(j);
               if(ch==ch1)
               {
                   i++;
               }
               else
               {
                   l++;
               }
            }
        }
       return l;
    }
    public static String arrange(String str)
    {
         char[] charArray = str.toCharArray();
         Arrays.sort(charArray);
         String nstr = new String(charArray);
         return nstr;
    }
}
