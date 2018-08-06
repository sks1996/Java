import java.util.*;
public class geek4geek8 
{
    public static void main(String args[])
    {
        int arr[] =  {92, 75, 65, 48, 45, 35};
        HashMap<Integer,Integer> hm=new HashMap<>();
        int k=10;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int sum=arr[i]+arr[j];
                if(!hm.containsKey(sum))
                {
                    hm.put(sum,1);
                }
            }
        }  
    }
}
