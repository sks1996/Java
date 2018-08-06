import java.util.*;
class x7
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the length of aray");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter element in array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        for (int i = 0; i <a.length-1; i++)
        {
            for (int j = 0; j <a.length-i-1; j++)
            {
                if (a[j] > a[j+1])
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
         for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}