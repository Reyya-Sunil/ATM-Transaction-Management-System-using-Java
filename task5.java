import java.util.*;
public class task5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);//scanner object 
	System.out.print("Enter your Number  A :");
	int a = sc.nextInt(); //input by scanner a
	System.out.print("Enter your Number B :");
	int b = sc.nextInt(); //input by scanner b
	System.out.println("Before excu A:"+a);
	System.out.println("Before excu B:"+b);
	//terinary operator 
	int res = a<b? a=a+10 :(b=b+10);
	System.out.println("Result :"+res);
	System.out.println("After excu A :"+a);
	System.out.println("After excu B :"+b);
}
}
