import java.util.*;

class geek4geek13 {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    String s=sc.next();
                    
		    int r=0,e=0;
		    for(int k=0;k<s.length();k++)
		    {
		        if(Character.isDigit(s.charAt(k)))
		        {
		            //r=r+(int)(s.charAt(k));
		            r+=Character.getNumericValue(s.charAt(k));
                            e++;
		        }
		    }
		    
		    s=s.replaceAll("[0-9]","");
		    
                    char ch[]=s.toCharArray();
                    Arrays.sort(ch);
		  
                    //ch[s.length()-1]=(char)(r);
		    
                    String s1=""; //Arrays.toString(ch);
                    
                    
                    for(int k=0;k<ch.length;k++)
                    {
                        s1=s1+ch[k];
                    }
                    
                    s1=s1+Integer.toString(r);
                  
                    System.out.print(s1);
                    System.out.println("\n");
                    
		    System.out.println("");
		    
		}
	}
}