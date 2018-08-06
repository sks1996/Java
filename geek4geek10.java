import java.util.*;
import java.lang.*;
import java.io.*;

class geek4geek10 {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    
		    int t=gcd(a,b);
		    
		    System.out.print((a*b)/t+" ");
		    System.out.print(t+"\n");
		}
	}
	public static int gcd(int a,int b)
	{
	    if(b==0){
	        return a;
	    }
	    else{
	        return gcd(b , a%b);
	    }
	}
}