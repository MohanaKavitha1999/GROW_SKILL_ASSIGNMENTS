package Assignment1;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numer : ");
		int num = input.nextInt();
		input.close();
		
		int fact=1;
		
		//Factorial logic
		for(int i=num;i>0;i--) {
			fact = fact * i;
		}
		
		System.out.println("Factorial is : "+fact);

	}

}
