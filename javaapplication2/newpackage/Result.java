package javaapplication2.newpackage;

 public class Result extends multiple implements sport
{
    
    public double total  ;
    
    
    @Override
     public void putwt()
    {
        System.out.println("THE SPORTSWEIGHT IS="+sportswt);
    }
    void display()
    {
        putnumber();
        putmark();
        
        total = mark1 + mark2 + sportswt;
        System.out.println("THE TOTAL="+total);
    }
 }
 class compute
{
    public static void main(String args[])
    {
        Result s1=new Result();
        s1.getnumber(65);
        s1.getmark(90.0,95.0);
        s1.putwt();
        s1.display();
    }
}