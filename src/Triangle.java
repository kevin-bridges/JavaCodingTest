
public class Triangle implements Shape {

	private double hypotenuse;
	private double adjacent;
	private double opposite;

	public Triangle(double h, double a, double o) {
		this.hypotenuse=h;
		this.adjacent=a;
		this.opposite=o;
	}

	@Override
	public double getArea() {
		return this.adjacent*this.opposite/2;
	}

	@Override
	public double getPerimeter() {
		return this.hypotenuse+this.adjacent+this.opposite;
	}

}
