import java.util.*;
import java.lang.Math;
public class greater_num_scanner {
	public static int greater_num(int a,int b) {
		return Math.max(a, b);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your num :");
	int num1 = sc.nextInt();
	System.out.println("Enter your num : ");
	int num2 = sc.nextInt();
	System.out.println("Greater Num :"+greater_num(num1,num2));
}
}
