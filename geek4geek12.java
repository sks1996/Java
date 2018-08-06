import java.util.*;

class geek4geek12 {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int m=sc.nextInt();
		    int n=sc.nextInt();
		    int c=0;
		    for(int j=m;j<=n;j++)
		    {
		     if(j>=0 && j<=9)
		     {
		         c++;
                         continue;
		     }
		     c+=check(j);
		    }
		    System.out.println(c);
		}
	}
	public static int check(int a)
	{
	    int l=(int)Math.log10(a)+1;
            System.out.println(l);
	    char ch [] =(""+a).toCharArray();
	    int c=0;
	    for(int i=0;i<l-1;i++)
	    {
	        if(Math.abs(ch[i]-ch[i+1]) == 1)
	        {
	            c++;
	        }
	        else
	        {
	            break;
	        }
	    }
	    if(c==l-1)
	    {
              //  System.out.println(a+""+c);
	        return 1;
	    }
	    else
	    return 0;
	}
}