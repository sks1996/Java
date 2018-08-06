import java.util.*; 
class strringbuffer1
 {
 public static void main(String args[]) 
 {
     StringBuffer sb = new StringBuffer();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a string");
     sb.append(sc.nextLine());
     sb.reverse();
     System.out.println("new string "+sb);
 
 }
}
