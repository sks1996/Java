import java.io.*;
class NewClass
{
public static void main(String args[])
{
    int i;
FileInputStream fin=null;
try
{
fin=new FileInputStream("abc.txt");
do
{
    i=fin.read();
    if(i!=-1)
        System.out.print((char)i);
}while(i!=-1);
}
catch(IOException e)
{
System.out.println("end of file");
}
try
{
    if(fin!=null)
        fin.close();
    System.out.println("file closed");
}
catch(IOException e)
{
    System.out.println("file not found");
}
}
}