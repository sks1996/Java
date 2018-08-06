package javaapplication2.newpackage;

  class  Student
  {
      int roll;
      void getnumber(int r)
      {
          roll=r;
      }
      void putnumber()
      {
          System.out.println("THE ROLL NUMBER IS="+roll);
      }
    }
 class multiple extends Student
{
    double mark1,mark2;
    
    
    void getmark(double m1,double m2)
    {
        mark1=m1;
        mark2=m2;
    }
    void putmark()
    {
        System.out.println("THE MARKS ARE="+mark1+" "+mark2);
    }
}
 
                                                                                                                                                                                          