package Assignment1;
import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = input.nextInt();
		boolean flag=true;
		input.close();
		if(num==0) {
			flag=false;
		}
		else{
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					flag=false;
					break;
				}
				
			}
		}
		
		if(flag==true) {
			System.out.println("Given number is Prime number");
		}
		else {
		System.out.println("Given number is not a Prime number");
		}

	}

}
