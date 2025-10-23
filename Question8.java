package Assignment1;

class car{
	String brand;
	car(){
		brand="ford";
	}
	String getBrand() {
		return brand;
	}
}

public class Question8 {

	public static void main(String[] args) {
		car brand1 = new car();
		String brandName = brand1.getBrand();
		System.out.println(brandName);

	}

}
