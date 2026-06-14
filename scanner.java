import java.util.*;

public class scanner {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your name :");
	String name = s.nextLine();
	System.out.println("Enter your age : ");
	int age = s.nextInt();
    System.out.println("Are you Married (YES/NO) :");
	String mar =s.next();
	System.out.println("Enter your perc :");
	double perc = s.nextDouble();
	/// o/p statement
	System.out.println("Name :"+name);
	System.out.println("Age :"+age);
	System.out.println("Perc :"+perc);
	System.out.println("Married :"+mar);
}
}
