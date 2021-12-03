package comp380;

public class Square implements Shape {
	double s;
	public Square(double side) {
		s = side;
	}
	@Override
	public double getArea() {
		return (s * s);
	}

}
