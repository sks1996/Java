import java.util.*;

public class geek4geek 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a[] =new int[t];
        for(int i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(max1(a));
        Arrays.sort(a,0,max1(a));
        System.out.println(a[max1(a)]-a[0]);
    }
    static int max1(int a[])
    {
        int max=0;
        int pos=-1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                pos=i;
            }
        }
        return pos;
    }
    
}
