import java.util.*;

class hackerRank106
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        
       
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==1)
                {
                    c++;
                }
                else if(a[i][j]==0)
                {
                    al.add(c);
                    c=0;
                }
            }
        }
      int c=0;
         for(int i=0;i<n;i++)
         {
            
            for(int j=0;j<m;j++)
            {
               if(i==j)
               {
                if(a[i][j]==1)
                {
                    c++;
                }
                else if(a[i][j]==0)
                {
                    al.add(c);
                    c=0;
                }
               }
             }
         }
         System.out.println(al);
        System.out.println(Collections.max(al));
    }
    
}
