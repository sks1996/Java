import java.util.Scanner;
public class PB1 
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i =0;i<n;i++)
        {
                a[i]=sc.nextInt();
        }
        int nt=0;
        int j=0;  
        for(int i =0;i<n;i++)
        {
             int t=a[j];
            if(a[i]==-1)
            {
                continue;
            }
            if(last(t)==last(a[i]) )
            {
                if(t>a[i])
                {
                 nt=nt*1*(int)Math.pow(10,num(t-1))+t;
                 a[i-1]=-1;
                }
                else
                {
                    nt=nt*1*(int)Math.pow(10,num(t-1))+a[i];
                    a[i]=-1;
                }
            }
            else if(last(t)>last(a[i]))
            {
                nt=nt*1*(int)Math.pow(10,num(t-1))+t;
                a[i-1]=-1;
            }
              else if(last(t)<last(a[i]))
            {
                nt=nt*1*(int)Math.pow(10,num(t-1))+a[i];
                a[i]=-1;
            }
        }
            System.out.println(nt);
    }
    public static int num(int a)
    {
        int c=0;
        while(a>0)
        {
            c++;
            a=a/10;
        }
        return c;
    }
    public static int last(int a)
    {
        
        return a/(int)Math.pow(10,num(a)-1);
    }
    
}
