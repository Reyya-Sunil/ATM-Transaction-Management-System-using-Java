import java.util.*;

public class countdigit {
	public static void calcu_digit(int num) {
		

		int sum=0;
		int remove =0;
		int count =0;
	
		while(num != 0) {
			 count += num%10;
		}
	
		for(int i=0;i<=num;i++) {
		
		  sum+=i; 
		  remove = num/10;
		  
		}
		System.out.println("No of digit :"+count );
		System.out.println("Sum of all digit :"+sum);
		System.out.println("remove digit :"+remove);
		
		
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your number :");
	int num = sc.nextInt();
	calcu_digit(num);
}
}
