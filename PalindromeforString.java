import java.util.*;
public class PalindromeforString {
	public static boolean check(String Start) {
	    
		String rev ="";
		
		int i;
		for(i=Start.length()-1;i>=0;i--) {
		rev = rev+Start.charAt(i);	
		}
		System.out.println(Start);
		System.out.println(rev);
		return rev.equals(rev);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER YOUR STRING ");
	String in = sc.next();
	System.out.println(check(in));
	
}
}
