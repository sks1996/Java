import java.util.*;

public class HashMap1 {
    public static void main(String args[])
    {        
        int a[]={1,3,4,5,3,4,5};
        searh(a);
    }
    public static void searh(int a[])
    {
        HashMap<Integer , Integer> hm=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(!hm.containsKey(a[i]))
            {
                hm.put(a[i],1);
            }
            else
            {
              hm.put(a[i],hm.get(a[i])+1);  
            }
        }
        // System.out.println(Arrays.asList(hm));
        SortedSet<String> values = new TreeSet<String>((Comparator<? super String>) hm.values());
        if(hm.containsValue(1))
        {
         System.out.println(values);
        }
    }
}
