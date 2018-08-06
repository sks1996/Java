//to reverse the words and the sentence
import java.io.*;
class x
{
    public static void main(String args[]) throws IOException
    {
       BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
       System.out.println("enter the string");
       String s=br.readLine();
       s=s+" ";
    
       String ns=" ",t="";
       int c=0;
       for (int i=0;i<s.length();i++)
       {
           if (s.charAt(i)==' ')    
           {
               t=s.substring(c,i);
              // String reverse=new StringBuilder(t).reverse().toString();
               StringBuffer reverse=new StringBuffer(t).reverse();
               c=i;
               ns=ns+" "+reverse;
           }
       }
       System.out.println("the new string is"+ns);
    }
}