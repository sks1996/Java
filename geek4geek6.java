import java.util.*;
public class geek4geek6 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch1 []=sc.next().toCharArray();
        char ch2 []=sc.next().toCharArray();
        int k=0,t=0;
        while(k<ch2.length)
        {
        int c=0;
        for(int i=t;i<ch1.length;i++)
        {
           if (ch2[k]==ch1[i])
           {
               t++;
               c++;
           }
        }
        if(c==0)
        {
            System.out.print(ch2[k]);
        }
        k++;
        }
    }
    
}
