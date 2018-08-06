import java.util.*;
public class geek4geek3 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
//      int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int al[]=new int[a];
        int bl[]=new int[b];
        
        for (int i=0;i<a;i++)
        {
            al[i]=sc.nextInt();
        }
        
         for (int i=0;i<b;i++)
        {
            bl[i]=sc.nextInt();
        }
         
      
        System.out.println("hii");
          
         
         for(int i=0;i<a;i++)
         {
              int c=0;
             for(int j=0;j<b;j++)
             {
                 if(al[i] >= bl[j])
                 {
                     c++;
                 }                    
                 
             }
              System.out.println(c);
         }
       
         
       /*
        int c=0,t=0;
        
        for (int i=0;i<b;i++)
        {
            if( al[t] <=bl[i] )
            {
                c++;
                System.out.println(c);
            }
            else
            {
                System.out.println(c);
                c=0;
                t++;
            }
        }
           */
    }
}
