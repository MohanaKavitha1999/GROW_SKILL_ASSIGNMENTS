package Assignment1;
class school2{
	String name,address;
	int strength ;
	
	school2(String name, String address){
		this.name=name;
		this.address=address;
	}
	school2(String name, String address,int strength){
		this.name=name;
		this.address=address;
		this.strength=strength;
	}
	void display() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(strength);
	}
}

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		school2 obj1 = new school2("Mohana","Chennai");
		obj1.display();
		
		school2 obj2 = new school2("Mohana","Chennai",87);
		obj2.display();
		

	}

}
