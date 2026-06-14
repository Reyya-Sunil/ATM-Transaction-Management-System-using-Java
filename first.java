import java.util.*;
public class first{
	 public static void  Sunil(int n) {
		while(n>=1) {
		String b = "";
		int x = n%2;
		n= n/2;
		b=x+b;
		System.out.print(b);
		}
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a decimal to convert in binary : ");
		int n = sc.nextInt();
		Sunil(n);
	}
}