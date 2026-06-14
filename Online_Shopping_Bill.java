
public class Online_Shopping_Bill {
public static void main(String[] args) {
	int price1 = 400,price2 = 600,price3 =200;
	int sum = price1+price2+price3;
	System.out.println("Total price :"+(sum));
	int dep = 50;
	System.out.println("total delivery charge :"+(sum += dep));
	String bill_check2 = sum >=1000 ?"true":"false";
	System.out.println("Is bill greater than 1000 ?"+bill_check2);
	String bill_check3 = sum == 1250 ? "true":"false";
	System.out.println("Is bill equal to 1250 ?"+bill_check3);
	String bill_check4 = sum == 500 && sum ==2000 ?"true":"false";
	System.out.println("Is bill between 500 and 2000?"+bill_check4);
	System.out.println("Thank you ");
	
	
	
	
}
}
