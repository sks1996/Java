import java.util.*;
class codechef4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for (int i=0;i<N;i++)
        {
            int n=sc.nextInt();
            int[] t=new int[n];
            int[] a=new int[n];
            int[] b=new int[n];
            
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
                b[j]=sc.nextInt();
                t[j]=a[j]*b[j];
            }
            for(int j=0;j<n-1;j++)
            {
                int pos=-1;
                if(t[j]<t[j+1])
                {
                  pos=j+2;
                }
                else if(t[j]==t[j+1])
                {
                    if(b[j]>b[j+1])
                    {
                        pos=j+1;
                    }
                    else if(b[j]==b[j+1])
                    {
                        pos=j+1;
                    }
                    else
                    {
                        pos=j+2;
                    }
                }
                else
                {
                  pos=j+1;
                }
                System.out.println(pos);
            }
            
        }
        
    }
    
}
