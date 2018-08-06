import java.util.*;
class codechef9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        codechef9 ob=new codechef9();
        int n=sc.nextInt();
        int a[]=new int[n];
        int e=0,o=0;
        for (int i=0;i<n;i++)
        {
            int t=sc.nextInt();
            if(t%2==0)
            {
            e+=1;
            }
        else
            o+=1;
           }
        if(o>=e)
        {
            System.out.println("NOT READY");
        }
        else
            System.out.print("READY FOR BATTLE");
    }
}
