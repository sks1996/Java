import java.util.*;

class geek4geek4 {
	public static void main (String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
               ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
		    al.add(sc.nextInt());
		    Collections.sort(al);
		    int l=i+1;
                    int t=(int)l/2;
		    if(l%2==0)
		    {
		       
                        System.out.println((al.get(t)+al.get(t-1))/2);
		    }
		    else
		    {
                   
		        System.out.println(al.get((int)t));
		    }
		}
	}
}