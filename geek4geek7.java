import java.util.*;

// symetric pairs
public class geek4geek7 {
    public static void main(String args[])
    {
        HashMap<Integer , Integer> hm=new HashMap<>();
        int arr[][] = new int[5][2];
        arr[0][0] = 11; arr[0][1] = 20;
        arr[1][0] = 30; arr[1][1] = 40;
        arr[2][0] = 5;  arr[2][1] = 10;
        arr[3][0] = 40;  arr[3][1] = 30;
        arr[4][0] = 10;  arr[4][1] = 5;
        
        for(int i=0;i<arr.length;i++)
        {
            int f=arr[i][0];
            int s=arr[i][1];
            
            Integer val=hm.get(s);
            System.out.println(val);
            
            if(val!=null && val==f)
            {
                System.out.println("(" + s + ", " + f + ")");
            }
             else  // Else put sec element of this pair in hash
               hm.put(f, s);
        }
    }
}
