//hackerrank euler problem 25
import java.util.*;
class hackerrank2
{
    public static int x;
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            x=sc.nextInt(); 
            fab();
            
        }
    }
    public static int count1(int x,int y)
    {
        int c=0,f=0;
        for(int i=x;i>0;i=i/10)
        {
            c++;
            if(c==y)
            {
                f=1;
            }
            else {
                f =0;
            }
        }
        return f;
    }
   public static void fab()
   {
    int a=0,b=1,c=0,f=0;
    while(a>=0)
    {
        c=a+b;
        a=b;
        b=c;
        f++;
        int g=count1(c,x);
        if(g==1)
        {
            System.out.println(f+1);
            break;
        }
    }
   }
}
