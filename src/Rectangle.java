
public class Rectangle implements Shape {

	private double height;
	private double width;
	
	
	public Rectangle(double h, double w) {
		this.height=h;
		this.width=w;
	}

	@Override
	public double getArea() {
		return this.height*this.width;
	}

	@Override
	public double getPerimeter() {
		double totalHeight = this.height*2;
		double totalWidth= this.width*2;
		return totalHeight + totalWidth;
	}

}
