import java.util.*;
import java.lang.*;
public class hackerRank20
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        ArrayList<String> al=new ArrayList<>(Arrays.asList(s)); //string to array
        
        String j =TextUtils.join(",",al);
        System.out.print(j);
    }
    
}   
