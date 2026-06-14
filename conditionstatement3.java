import java.util.*;
public class conditionstatement3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your first  Num :");
	int a = sc.nextInt();
	System.out.println("enter your Second Num :");
	int b = sc.nextInt();
	System.out.println("enter your third Num : ");
	int c =sc.nextInt();
	if(a>b && a>c) {
		System.out.println(a);
	}else if(b>c && b>c) {
		System.out.println(b);
	}else {
		System.out.println(c);
	}
}
}
