//first program to run

import java.io.*;
public class hackerRank3
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
       // System.out.println("enter the string");
       String s=br.readLine();
       String ns=" ",t="";
       char ch;int c=0, l=s.length();
       for(int i=0;i<l;i++)
       {
            ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            c++;
       }
       System.out.println(c+1);
    }
    
}
