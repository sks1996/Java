import java.util.*;
public class hackerRank33 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>(n);
        ArrayList<Integer> t=new ArrayList<>(5);
        for(int i =0;i<n;i++)
        {
            al.add(sc.nextInt());
        }
       
        for(int i =1;i<=5;i++)
        {
            t.add(Collections.frequency(al, i));
        }
        
         
          //  System.out.println(t);
        
    
    int x=Collections.max(t);
   // System.out.print(t);
    System.out.println(t.indexOf(x)+1);
    }
}
