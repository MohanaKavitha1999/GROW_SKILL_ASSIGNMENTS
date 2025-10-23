package Assignment2;

public class Sum_of_Odd_numbers {

	public static void main(String[] args) {
		int res = 0;
		for(int i=1;i<=20;i++) {
			if(i%2==1) {
				res=res+i;
				//System.out.println(i);
			}
		}
		System.out.println(res);
	}

}
