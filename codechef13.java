import java.util.*;
class codechef13
{
    public static void check(String v,String u)
    {
        char ch1,ch2;
         int l1=v.length();
         int l2=u.length();
         int c=0;
         for(int i=0;i<l1;i++)
             {
                 ch1=v.charAt(i);
                 for(int j=0;j<l2;j++)
                 {
                     ch2=u.charAt(j);
                     if(ch2==(ch1))
                     {
                         c++;
                         break;
                     } 
                 }
             }
          System.out.print(c+" "+l1);
             if(c==l1)
             {
                 System.out.println("YES");
             }
             else
             {
                 System.out.println("NO");
             }
        }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        codechef13 ob=new codechef13();
        for (int k=0;k<n;k++)
        {
         String a=sc.next().toLowerCase();
         String b=sc.next().toLowerCase();
         if(a.length() <=b.length())
         {
             codechef13.check(a,b);
         }
         else
         {
            codechef13.check(b,a);
         }
        }
    }
}
