
public class Circle implements Shape {

	private double radius;

	public Circle(double r) {
		this.radius = r;
	}

	@Override
	public double getArea() {
		double value = Math.PI*this.radius*this.radius;
		return Math.round(value);
	}

	@Override
	public double getPerimeter() {
		double value = Math.PI*this.radius*2;
		return Math.round(value);
	}

}
