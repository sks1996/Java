import java.util.*;
//accept ni hua question was ol lallindrome
class codechef12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
           String s=sc.next();
           if(s.length()==1 ||s.length()==0)
           {
               System.exit(0);
           }
           int l=s.length()+1;
           if(l%2==0)
           {
               String a=s.substring(0,l/2-1);
               String b=s.substring(l/2,l-1);
               String reverse=new StringBuilder(b).reverse().toString();
               if(b.equals(a)|| reverse.equals(a))
               {
                   System.out.println("YES");
               }
               else
               {
                   System.out.println("NO");
               }
           }
           else
           {
               String a=s.substring(0,l/2);
               String b=s.substring((l/2),l-1);
               String reverse=new StringBuilder(b).reverse().toString();
               if(b.equals(a)|| reverse.equals(a))
               {
                   System.out.println("YES");
               }
               else
               {
                   System.out.println("NO");
               }
               
           }
        }
    }
}
