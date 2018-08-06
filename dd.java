import java.io.*;
import java.util.*;
class dd
{
public static void main(String[] args)throws IOException 
{
BufferedReader st=new BufferedReader(new InputStreamReader(System.in));
String str;
System.out.println("Enter the string ");
str=st.readLine();
char[] charArray = str.toCharArray();
Arrays.sort(charArray);
String nstr = new String(charArray);
System.out.println("The sorted string is "+nstr);
}
}