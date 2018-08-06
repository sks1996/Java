import java.util.*;

class Xyz
{
    int a;
    String b;
    int age;
    
   Xyz(int a, String b,int age)
   {
       this.a=a;
       this.b=b;
       this.age=age;
   }   
}
class HashMap2
{
    public static void main(String args[])
    {
        HashMap<Integer, Xyz> hm =new HashMap<>();
        
        Xyz ob1=new Xyz(11,"aja",7);
        Xyz ob2=new Xyz(12,"bja",8);
        Xyz ob3=new Xyz(13,"cja",9);
        
        hm.put(1,ob1);
        hm.put(2,ob2);
        hm.put(3, ob3);
        
        for(Map.Entry<Integer, Xyz> mk:hm.entrySet())
        {
            System.out.println(mk.getKey()+" "+mk.getValue());
        }
    }
}