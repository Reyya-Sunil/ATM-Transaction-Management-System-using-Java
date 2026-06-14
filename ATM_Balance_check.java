
public class ATM_Balance_check {
public static void main(String[] args) {
	System.out.println("Welcome to sbi ");
	int b = 2000;
	int d = 500;
	System.out.println("Balance after adding money :"+(b+=d));
	int w = 700;
	System.out.println("Balance after withdraw money :"+(b-=w));
	String  current_balance = b>=1800 ? "true":"False";
	System.out.println("Is balance greater then 1000 ?"+current_balance);
	String equal_balance = b==1800 ?" true":"False";
	System.out.println("Is balance equal to 1800 ?"+equal_balance);
	String balance_between = (b>=500) &&(b>3000)? "true" :"False";
	System.out.println("Is balance between 500 and 3000 ?"+balance_between);
	System.out.println("Thank you");
}
}
