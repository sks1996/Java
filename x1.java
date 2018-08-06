import java.io.*;
class x1
{
    public static void main(String args[]) throws IOException
    {
       BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
       System.out.println("enter the string");
       String s=br.readLine();
       String ns = s.replaceAll("[aeiouAEIOU]","");
       System.out.println(ns);
    }
}