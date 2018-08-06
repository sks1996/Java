import java.util.Scanner;
public class hackerRank24 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int c []= new int[n];
        int v;
          for(int i=0;i<n;i++)
          {
              v=pos(a[i],b,n);
              c[i]=a[i]-b[v];
              v=0;
          }
          int min=min(c,n);
          int t=pos(min,c,n);
          System.out.println(t);
    }
    public static int pos(int a,int b[],int n)
    {
        int p=0;
         for(int i=0;i<n;i++)
        {
            if(a==b[i])
            {
                p=i;
                break;
            }
        }
         return  p;
    }
    
    
    public static int min(int a[],int n)
    {
      int min1=0;
      for(int k=0;k<n;k++)
      {
          if(min1<a[k])
          {
              min1=a[k];
          }
      }
        return min1; 
    }
    /*
    public static void post(int a,int b[],int n)
    {
        int y;
         for(int i=0;i<n;i++)
        {
            if(a==b[i])
            {
                break;
            }
        }
         System.out.println(y);
    } */
}
