import java.util.*;
import java.lang.Math;
public class sum_bylang_import {
	public static int add(int a,int b) {
		return Math.addExact(a, b);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Num :");
	int num1 = sc.nextInt();
	System.out.println("Enter your Num :");
	int num2 = sc.nextInt();
	System.out.println("Sum of Num :"+(add(num1,num2)));
	
}
}
