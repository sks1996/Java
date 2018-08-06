   public class TRY{

    public static void printPalindromes(String s) {
        if (s == null || s.length() < 3)
            return;

        System.out.println("Odd Length Palindromes:");
        // Odd Length Palindromes
        for (int i=1; i<s.length()-1; i++) {
            for (int j=i-1,k=i+1; j>=0 && k<s.length(); j--,k++) {
                if (s.charAt(j) == s.charAt(k)) {
                    if (k-j+1 >= 3)
                        System.out.println(s.substring(j, k+1) + " with index " +j+ " and "+k);
                }
                else
                    break;
            }
        }

        System.out.println("\nEven Length Palindromes:");
        // Even Length Palindromes
        for (int i=1; i<s.length()-1; i++) {
            for (int j=i,k=i+1; j>=0 && k<s.length(); j--,k++) {
                if (s.charAt(j) == s.charAt(k)) {
                    if (k-j+1 >= 3)
                        System.out.println(s.substring(j, k+1) + " with index " +j+ " and "+k);
                }
                else
                    break;
            }
        }
    }

    public static void main(String[] args){
        String s = "babammm";
        printPalindromes(s);
    }
}