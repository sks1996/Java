import java.io.*;
class x5
{
    public static void main(String args[]) throws IOException
    {
       BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
       System.out.println("enter the string");
       String s=br.readLine();
       String reverse=new StringBuilder(s).reverse().toString();
       if(s.equals(reverse))
       {
           System.out.println("pallindrome");
       }
       else
         System.out.println(" non pallindrome");  
    }
}
