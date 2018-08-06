import java.util.*;

public class Count_character {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        String s=sc.next();
        
        HashMap<Character,Integer> hm=new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(!hm.containsKey(s.charAt(i)))
            {
                int c=hm.get(s.charAt(i))+1;
                hm.put(s.charAt(i),c+ 1);
            }
        }
        
       for (Map.Entry entry : hm.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
            }
    }
}
