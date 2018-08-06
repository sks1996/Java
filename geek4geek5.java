import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException { 
		//code
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int n=(int)br.read();
		for(int i=0;i<n;i++)
		{
		    String s=br.readLine();
		    String s1="";
		    int k=0;
		    for(int t=0;t<s.length();t++)
		    {
		        if(s.charAt(t)==' ')
		        {
		            s1=s1+s.substring(k,t);
		            k=t+1;
		        }
		    }
		   System.out.println(s1);
		}
	}
}