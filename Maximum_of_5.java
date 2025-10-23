package Assignment1;
import java.util.Scanner;

public class Maximum_of_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		Scanner input = new Scanner(System.in);
		
		//To collect 5 numbers
		for(int i=1;i<6;i++) {
			System.out.println("Enter " + i +" Number :");
			num[i-1] = input.nextInt();			
			
		}
		input.close();
		
		//Pick the maximum
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				int temp;
				if(num[i]>num[j]) {
					temp = num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		// Display Result
		System.out.println("The maximum number is : "+ num[4]);
	}

}
