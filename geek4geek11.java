import java.util.*;
import java.lang.*;
import java.io.*;

class geek4geek11 {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
		 ArrayList<Integer> al=new ArrayList<>();
		 int n=sc.nextInt();
		 int k=sc.nextInt();
		 for(int i=0;i<n;i++)
		 {
		     al.add(sc.nextInt());
		 }
		 Collections.rotate(al,-k);
		 for(int i=0;i<n;i++)
		 {
		     System.out.print(al.get(i));
		 }
		}
		
		
	}
}