//array left rotation
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerRank29 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++)
            {
            int t=in.nextInt();
            al.add(t);
        }
        Collections.rotate(al,-k);
        //get the array
        Integer ia[]=new Integer[al.size()];
        ia=al.toArray(ia);
        for(int i=0;i<ia.length;i++)
            {
        System.out.print(ia[i]+" ");
        }
    }
}
