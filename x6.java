//ascii characters
import java.io.*;
class x6
{
    public static void main(String args[]) throws IOException
    {
       BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
       System.out.println("enter the string");
       String s=br.readLine();
       for (int i=0;i<s.length();i++)
       {
           System.out.println((int)(s.charAt(i)));
       }
    }
}