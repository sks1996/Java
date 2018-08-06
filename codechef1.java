import java.util.*;
import java.io.*;
class codechef1
{
        public  void check (String e,String f)
    {
        int i,j,k,c=0;
        char ch,ch1;
        String v="",v1="";
               for(j=0;j<e.length();j++)
               {
                   ch=e.charAt(j);
                   v=v+ch;
                   for(k=0;k<f.length();k++)
                   {
                    ch1=f.charAt(k);
                    v1=v+ch1;   
                String reverse=new StringBuilder(v1).reverse().toString();
                if(v1.equals(reverse))
                {
                    c++;
                }
                   }
                v1=" ";
              }
        if(c>0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
    
    public static void main(String args[]) throws IOException,NumberFormatException
    {
        BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        codechef1 ob=new codechef1();
        int n =sc.nextInt();
        int t[]=new int[n];
        String e[]=new String[n];
        String f[]=new String[n];
        for (int i=0;i<n;i++)
        {
            e[i]=br.readLine();
            f[i]=br.readLine();
            ob.check(e[i],f[i]);
        }
    }

}



/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
class STRPALIN
{
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bufferedReader.readLine());
		while(t>0){
			String A = bufferedReader.readLine();
			char a[] = A.toCharArray();
			String B = bufferedReader.readLine();
			char b[] = B.toCharArray();
			int c=0;
			for(int i = 0; i< a.length; i++){
				for(int j = 0; j<b.length; j++){
					if(a[i]==b[j]){
						c++;
						break;
					}
				}
			}
			if(c>0)
				System.out.println("Yes");
			else
				System.out.println("No");
			t--;
		}
 
	}
 
}
*/