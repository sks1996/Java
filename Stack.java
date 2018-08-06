import java.util.Scanner;


public class Stack 
{
  private int stc[];
  private int top;

    Stack(int size)
    {
    stc=new int[size];
    top=-1;
    }
    void push(int item)
    {
        if(top==stc.length-1)
        {
            System.out.println("Stack is full");
        }
        else
            stc[++top]=item;
    }
    int pop()
    {
        return stc[top--];
    }
}
class Stack1
{
    
    public static void main(String args[])
    {
    int i;
    Stack ob=new Stack(5);
    
    for(i=0;i<5;i++)
    {
        ob.push(i);
    }
     for(i=0;i<5;i++)
    {
        System.out.println(ob.pop());
    }
    
    }
}
