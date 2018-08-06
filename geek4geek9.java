import java.util.*;
import java.lang.*;
import java.io.*;

class geek4geek9 {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int x=0;x<t;x++)
		{
		int n=sc.nextInt();
                int a[]=new int [n];
		for(int i=0;i<n;i++)
		{
	        a[i]=sc.nextInt();
		}
                
		HashMap<Integer,Integer> hm=new HashMap<>();
                int c=0;
                for(int i=0;i<n;i++)
		{
		 for(int j=i+1;j<n;j++)
		  {
		    int sum=a[i]+a[j];
		    if(!hm.containsKey(sum))
		    {
		        hm.put(sum,j);
		    }
		    else
		    {
		        c++;
		    }
		  }
		}
                
		if(c==0)
		{
		    System.out.println(0);
		}
		else
		{
		    System.out.println(1);
		}
                
		}
	}
}