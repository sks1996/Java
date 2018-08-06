import java.util.Scanner;

public class hackerRank26 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t;
        for(int i=0;i<n;i++)
            {
            t=sc.nextInt();
            fib1(t);
        }
    }
    public static int digit1(int a)
        {
        int c=0;
        while(a>0)
            {
            c++;
            a=a/10;
        }
        return c;
    }
    public static void fib1(int n)
        {
        int a=0,b=1,c=0;
        for(int i=1;;i++)
            {
            c=a+b;
            int r=digit1(c);
            if(r==n)
                {
                System.out.println(i+1);
                break;
            }
            a=b;
            b=c;
        }
    }
}