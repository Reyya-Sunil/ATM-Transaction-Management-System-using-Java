import java.util.*;
public class conditionalStatement {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter your age :");
	int age = sc.nextInt();
	if(age<=12) {
		System.out.println("child age");
	}else if(age >13 && 19<= age) {
		System.out.println("teenage age");
	}else if(age>=20 && 59 <= age) {
		System.out.println("Adult age");
	}else {
		System.out.println("Senior citizen");
	}
}
}
