import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pankaj {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String a[]=new String[s2.length()];
        a=s2.split(":");
        s1=s1.replace("_",".");
        
        String d="";
       // Pattern pattern = Pattern.compile(s1);
      /* 
        for (int i=0;i<a.length;i++)
        {
            System.out.println("jo");
            Matcher matcher = pattern.matcher(a[i]);
            boolean matches = matcher.matches();
            System.out.println(matches);
            if(matches==true) {
                System.out.print(a[i]);
                if(i!=a.length-1)
                {
                    d=d+a[i].toUpperCase()+":";
                }
                else{
                    d=d+a[i].toUpperCase();
                }
            }
        }
        System.out.print(d);
    }
    */
       String k=abc(s1,s2);
       
       System.out.println(k);
        
    }
    
    
    public static String abc(String s1 , String s2)
    {
        String a[]=new String[s2.length()];
        a=s2.split(":");
        s1=s1.replace("_",".");
        
        String d="";
        Pattern pattern = Pattern.compile(s1);
 
       
        for (int i=0;i<a.length;i++)
        {
            Matcher matcher = pattern.matcher(a[i]);
            boolean matches = matcher.matches();
            if(matches==true) {
               // System.out.println(a[i]);
                
                    d=d+a[i].toUpperCase()+":";
                }
            
        }
        int l=d.length();
        return d.substring(0, l-1);
    }
   
    
}
