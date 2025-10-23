package Assignment2;
import java.util.Scanner;

public class Fibonaaci_Series {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the limit :");
		int limit = input.nextInt();
		input.close();
		
		int[] list = new int[limit];
		list[0]=0;
		list[1]=1;
		for(int i=2;i<limit;i++) {
			list[i]=list[i-1]+list[i-2];
		}
		System.out.println("List of fibonaaci :");
		for(int x:list) {
			System.out.println(x);
		}
		
	}

}
