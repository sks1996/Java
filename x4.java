import java.io.*;
class x4
{
    public static void main(String args[]) throws IOException
    {
       BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
       System.out.println("enter the string");
       String s=br.readLine();
       String ns=" ", t = "";
       int c=s.length();
       s=' '+s;
       for (int i=s.length()-1;i>=0;i--)
       {
           if (s.charAt(i)==' ')    
           {
               t=s.substring(i,c+1);
                   c=i;
               ns=ns+" "+t;
           }
       }
       System.out.println("the new string is ::"+ns);
    }
}