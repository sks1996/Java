import java.io.*;
class x3
{
    public static void main(String args[]) throws IOException
    {
       BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
       System.out.println("enter the string");
       String s=br.readLine();
       char ch;int l=s.length();
       for(int i=0;i<l;i++)
       {
            ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            System.out.print(Character.toLowerCase(ch));
            else if(Character.isLowerCase(ch))
            System.out.print(Character.toUpperCase(ch));
            else
            System.out.print(ch);
       }
    }
}