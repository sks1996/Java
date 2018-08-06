import java.io.*;
class tt
{
    public static void main(String [] args)
{
    FileInputStream fin=null;
    FileOutputStream fout=null;
    try
    {
        fin=new FileInputStream("abc.txt");
        fout=new FileOutputStream("xyz.txt");
        int i=fin.read();
        while(i!=-1)
        {
            fout.write(i);
            i=fin.read();
        }
    }
    catch(IOException e)
    {
        System.out.println("this error occured \n "+e.getMessage());
    }
    finally
    {
        System.out.print("content copy");
    }
}
}
