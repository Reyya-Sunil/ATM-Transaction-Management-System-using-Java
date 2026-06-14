import java.util.*;
public class pr1520 {
	public static boolean count (int n) {
		int j =n;
		int count =0;
		while(j!=0) {
			int d = j %10;
			count  ++;
			j/=10;
		}
		int sum =0;
		int temp = n;
		while(temp>0) {
			int d= temp %10;
			sum += pow(d,count);
			temp /= 10;
		}
		return n==sum? true :false;
	}
	public static int pow(int d,int count) {
		int pow = 1;
		for(int i =1;i<= count;i++) {
			pow *=d;
		}
		return pow;
	}
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("ENTER YOUR NUMBER TO KNOW AMSTRONG NUMBER OR NOT ");
 int num = sc.nextInt();
 System.out.println(count(num));
}
}
