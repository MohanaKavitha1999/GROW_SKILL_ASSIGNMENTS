package Assignment1;

class school1{
	String name= "MKV Metric HR SEC SCHOOL";
	school1(){
		System.out.println(name);
	}
	
	void display() {
		System.out.println("This School is based out of Kolkata");
	}
}

public class Question2 {

	public static void main(String[] args) {
		school1 obj1 = new school1();
		obj1.display();

	}

}
