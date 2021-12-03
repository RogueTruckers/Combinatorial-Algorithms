package comp380;

public class Cube extends Square{
	public Cube(double side) {
		super(side);
	}
	@Override
	public double getArea() {
		return (6*super.getArea());
	}
}
