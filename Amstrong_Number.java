package Assignment1;
import java.util.Scanner;

public class Amstrong_Number {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = input.nextInt();
		int temp=0;
		
		int original = num;
		while(num>0) {
			
			int lastNum = num%10;
			temp = temp+(lastNum*lastNum*lastNum);
			num=num/10;
		}
		
		
		
		if(temp==original) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		input.close();
		
	}

}
