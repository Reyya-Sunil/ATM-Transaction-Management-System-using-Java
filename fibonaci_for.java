import java.util.*;
 public static int fibo(int num) {
	int n1 = 0;
	int n2 = 1;
	for(int i =0;i<=num;i++) {
		int c = n1+n2;
		System.out.println(c);
		n1=n2;
		n2=c;
	}
}

public class fibonaci_for {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
  System.out.println("Enter your num :");
  int num= sc.nextInt();
  fibo(num);
}
}
