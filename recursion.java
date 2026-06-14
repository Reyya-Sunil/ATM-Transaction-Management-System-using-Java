import java.util.*;
public class recursion {
	public static int  fact(int n) {
		if(n==1||n==0) {
			return 1;
		}
		return n*fact(n-1);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your fac! :");
	int num = sc.nextInt();
	System.out.println("Your fac! is : "+fact(num));
}
}
