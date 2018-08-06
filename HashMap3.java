import java.util.*;

class HashMap3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        HashMap<String , Integer> hm=new HashMap<>();
        
        String ars[]=s.split(" ");
        for (String t :ars)
        {
            if(!hm.containsKey(t))
            {
                hm.put(t, 1);
            }
            else
            {
                hm.put(t,hm.get(t)+1);
            }
        }
        
        for(Map.Entry<String ,Integer> sj:hm.entrySet())
        {
            System.out.println(sj.getKey()+" "+sj.getValue());
        }
    }
}