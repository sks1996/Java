import java.util.*;
class hackerRank34
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a="min(int, ";
        String t="";
        for(int i=0;i<n-1;i++)
        {
            t=t+a;
        }
        t=t+""+"int)";
         for(int i=0;i<n-2;i++)
        {
            t=t+")";
        }
        System.out.print(t);
    }
}