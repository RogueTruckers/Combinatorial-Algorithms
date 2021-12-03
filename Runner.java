package comp380;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double s = 2.0; //change s to be any length side you would like.
		Square a = new Square(s);
		Cube c = new Cube(s); 
		System.out.println("The area of the square is: " + a.getArea());
		System.out.println("The surface area is: " + c.getArea());
	}

}
