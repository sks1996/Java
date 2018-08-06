import java.util.*;
class codechef14
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int t,i,n,m;
       // System.out.println("enter the test cases");
        t=sc.nextInt();
        for(i=0;i<t;i++)
        {
            n=sc.nextInt();
            m=sc.nextInt();
            if(n>m)
            {
                System.out.println(n-m);
            }
            else
            {
                System.out.println(m-n);
            }
        }
    }
}