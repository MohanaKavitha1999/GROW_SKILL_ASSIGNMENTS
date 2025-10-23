package Assignment1;
import java.util.Scanner;
public class Palindrome_Number {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = input.nextInt();
		
		input.close();
		
		int rsv = 0;
		int copy=num;
		
		while(num>0) {
			int lastDigit = (num%10);//3
			rsv = (rsv*10)+lastDigit;
			num=(num/10);
		}
		System.out.println(rsv);
		System.out.println(copy);
		if(copy!=rsv || copy==0) {
			System.out.println("Given number is not a palindrome");
		}
		else {
			System.out.println("Given number is a palindrome");
		}
		

	}

}
