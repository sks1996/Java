     import java.io.*;
     class file1
         {
          public static void main(String args[])
           {
             int i;
             FileInputStream fin=null;
             try
             {
                 fin=new FileInputStream("a.txt");
              do
               {
                 i=fin.read();
                if(i!=-1)
                System.out.print((char)i);
               }while(i!=-1);
             }catch(IOException e)
               {
                 System.out.println("END OF FILE DETECTED");
               }
           try
                {
                 if(fin!=null)
                  {
                   fin.close();
                   System.out.println("in the close block");
                  }
                }catch (IOException e)
                {
                    
                    System.out.println("FILE NOT CLOSED");
                }
           }
      }