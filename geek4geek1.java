import java.util.*;

public class geek4geek1 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        int n =sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int t=sc.nextInt();
            al.add(t);
        }
        int max=Collections.max(al);
     //    System.out.println(max);
        int p=al.indexOf(max);
      //  System.out.println(p);
        int max1=0;
        for(int i=0;i<p;i++)
        {
            if((max-al.get(i))>max1)
            {
               //System.out.println(al.get(i));
                max1=-al.get(i)+max;
            }
  //           System.out.println(max1);
        }
        
        System.out.println(max1);
    }
    
}
