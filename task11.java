import java.util.*;
public class task11 {


public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
		System.out.println("Welcome to SBI ");
		int b = 2500;
		System.out.println("Balance :"+b);
		System.out.println("Enter your deposit ammount :");
		int de =sc.nextInt();
        int d =de;
		System.out.println("Deposit :"+(b+= d));
		int w =250;
		System.out.println("Withdrwa money :"+(b -=w));
		int de = 170;
		System.out.println("Deposit :"+(b +=de));
		int p =b*20;
		System.out.println("Profit :"+(b=p));
		int wi =2000;
		System.out.println("2 nd withdraw :"+(b -= wi));
		int t = b;
		System.out.println("Total bal :"+t);
		System.out.println("thank you ");
	
		
}

}


