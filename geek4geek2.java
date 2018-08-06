import java.util.*;
public class geek4geek2 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        int a[][]=new int[n][m];
        int b[][]=new int[n][m];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==1)
                {
                    int t = 0;
                    if(i>0)
                    {
                       t=0;
                    }
                    while(t<n)
                    {
                        b[t][j]=1;
                        t++;
                    }
                    int k=0;
                    if(j>0)
                    {
                        k=0;
                    }
                    while(k<m)
                    {
                        b[i][k]=1;
                        k++;
                    }
                }
            }
        }
      disp1(b,n,m);
    }
    
    public static void disp1(int a[][],int n,int m )
    {
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]);
                System.out.print("\t");
            }
            
            System.out.print("\n");
        }
    }
    
}
