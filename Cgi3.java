import java.util.Arrays;
import java.util.Scanner;
public class Cgi3 {
    public static void main(String args[])
    {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            
            int max = Arrays.stream(a).max().getAsInt();
            int c=0;
            
            for (int i=0;i<n;i++)
            {
               
                for (int j=i+1;j<n;j++)
                {
                    if(a[j]<a[i])
                    {
                        continue;
                    }
                    for (int k=j+1;k<n;k++)
                    {
                        
                        if(a[j]>a[k])
                        {
                            c++;
                        }
                    }  
                    //
                    if(a[j]==max)
                    {
                        break;
                    }
                }
            }
            System.out.println(c);
    }
}