import java.util.*;

public class condition7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your char :");
	String charac = sc.nextLine();
	char ch =charac.charAt(0);
	if(charac==charac.toUpperCase()) {
		System.out.println("UpperCase");
	}else {
		System.out.println("lower case");
	}
}
}
