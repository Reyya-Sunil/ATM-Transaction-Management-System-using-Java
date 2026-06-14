import java.util.*;
public class fibonaci_sum {
	public static void fibo(int num) {
		int n1 =0;
		int n2=1;
		for(int i =0;i<=num;i++) {
			int c= n1+n2;
			System.out.print(n1+" ");
			n1=n2;
			n2=c;
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a fibo num :");
	int num = sc.nextInt();
	fibo(num);

}
}
