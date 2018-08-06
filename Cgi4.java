
import java.util.HashSet;
import java.util.Set;

// Java program to find palindromic substrings of a string
 
public class Cgi4 
{
    private static void subPal(String str) {
        String s1 = "";
        int N = str.length(), count = 0;
        Set<String> palindromeArray = new HashSet<String>();
        System.out.println("Given string : " + str);
        System.out.println("******** Ignoring single character as substring palindrome");
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                int k = i + j - 1;
                if (k >= N)
                    continue;
                s1 = str.substring(j, i + j);
                if (s1.equals(new StringBuilder(s1).reverse().toString())) {
                    palindromeArray.add(s1);
                }
            }

        }
        System.out.println(palindromeArray);
        for (String s : palindromeArray)
            System.out.println(s + " - is a palindrome string.");
        System.out.println("The no.of substring that are palindrome : "
                + palindromeArray.size());
    }   
    // Driver Method
    public static void main(String[] args)
    {
        String str = "babammm";
        subPal(str);
    }
}