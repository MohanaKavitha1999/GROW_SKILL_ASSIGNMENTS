package Assignment2;

public class Sum_of_Even_numbers {

	public static void main(String[] args) {
		int res = 0;
		for(int i=2;i<21;i++) {
			if(i%2==0) {
				System.out.println(i);
				res=res+i;
			}
		}
		System.out.println(res);
	}

}
