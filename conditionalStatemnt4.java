import java.util.*;
public class conditionalStatemnt4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your char :");
	String b = sc.nextLine();
	int len = b.length();
    char ch = b.charAt(len);
    if(ch =='a'||ch=='A'||ch == 'e'||ch =='E'||ch =='i'||ch=='I'||ch == 'O'||ch =='o'||ch =='U'||ch =='u') {
    	System.out.println("It is vowel");
    }else {
    	System.out.println("Not vowels");
    }
}
}
