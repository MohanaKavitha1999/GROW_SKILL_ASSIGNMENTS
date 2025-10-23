package Assignment1;

class shape{ 
	double length;
	double breadth; 
	double pi = 3.14; 
	shape(double length, double breadth){
		this.length=length; 
		this.breadth=breadth; 
		} 
	public double square() { 
		//Area of square = l*l 
		return length * length; 
		} 
	public double rectangle() { 
		//Area of rectangle = 2(l+b) 
		return 2*(length+breadth); 
		} 
	public double circle() { 
		//area of circle = 2*pi*length; 
		return length * pi*2; } 	
}
public class Question1 {
	public static void main(String[] args) {
		shape value1 = new shape(2,2);
		value1.circle();
		value1.square();
		value1.rectangle();
		System.out.println(value1.circle());
		System.out.println(value1.square());
		System.out.println(value1.rectangle()); }
	}
	
