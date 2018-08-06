import java.util.*;
class codechef11
{
   /* public void sorting(int a[]) //sorting the array 
    {
      for (int c = 0 ; c < a.length; c++)
        {
          for (int d = 0 ; d < a.length - c - 1; d++)
            {
            if (a[d] < a[d+1])
            {
            int swap = a[d];
             a[d]   = a[d+1];
            a[d+1] = swap;
               }
             }
        }
    } */
  /*  public void search(int a[],int t) //for searching 
    {
      int pos=-1;
        for (int i=0;i<a.length;i++)
        {
               if(t==a[i])
               {
                  pos=i;
                  break;
               }
            }
        System.out.println(pos);
    } */
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        codechef11 ob=new codechef11();
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            int t=sc.nextInt();
            int a[]=new int[t+1];
           // ob.sorting(a[]);
           a[0]=-1;
           for(int k=1;k<=t;k++)
           {
               a[k]=sc.nextInt();
           }
              int x=sc.nextInt();
            int g=a[x];
        //    System.out.print(g);
           int swap;
           for (int c =1 ; c < a.length; c++)
        {
          for (int d = c+1 ; d < a.length; d++)
            {
            if (a[c] > a[d])
            {
             swap = a[c];
             a[c]   = a[d];
            a[d] = swap;
               }
             }
        }
          /* for(int k=0;k<=t;k++)
           {
               System.out.print(a[k]);
           } 
         */
            
            
           int pos=-1;
        for (int j=1;j<a.length;j++)
        {
               if(g==a[j])
               {
                  // System.out.print(a[j]);
                  pos=j;
                  break;
               }
            }
        System.out.println(pos);
        }
    }
}
 