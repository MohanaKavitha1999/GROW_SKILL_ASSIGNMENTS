package Assignment1;
import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the count : ");
		int n = input.nextInt();
		input.close();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");	
			}
			for(int j=1;j<2*(n-i);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
