import java.util.*;
public class nestedforloop {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a starting num :");
	int start =sc.nextInt();
	System.out.println("Enter a end num :");
	int end =sc.nextInt();
	for(int i =start;i<=end;i++) {
		for(int j =1;j<=10;j++) {
			System.out.println(i+"*"+j+"="+(i*j));
		}
		System.out.println("-----------------------");
	}
}
}
