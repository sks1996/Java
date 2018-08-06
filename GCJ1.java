import java.util.*;
class GCJ1 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=10;i<=n;i++)
            {
                int sum1=0;
            for(int j=i;j>0;j=j/10)
                {
                sum1=sum1+fact(j%10);
            }
            
          //  System.out.println(sum1);
            if(sum1%i==0)
                {
               //  System.out.println(i);
                sum=sum+i;
            }
        }
        System.out.println(sum);
        
    }
    
    public static int fact(int a)
        {
        int f=1;
        for(int i=1;i<=a;i++)
            {
            f=f*i;
        }
        return f;
    }
}