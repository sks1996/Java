import java.util.Scanner;

class codechef10
{
    static int smax=0,max=0,pos=-1;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[3];
        for (int u=0;u<n;u++)
        {
            for(int j=0;j<3;j++)
            {
                a[j]=sc.nextInt();
            }
            if((a[0]<a[1] & a[0]>a[2]) || (a[0]>a[1] & a[0]<a[2]))
                System.out.println(a[0]);
            else if((a[1]<a[0] & a[1]>a[2]) || (a[1]>a[0] & a[1]<a[2]))
                System.out.println(a[1]);
            else
                System.out.println(a[2]);
            
        }
    }
    
}
