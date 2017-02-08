import static org.junit.Assert.*;

import org.junit.Test;

public class ShapeTests {

	@Test
	public void CircleTest() {
		Shape circle = new Circle(5);
		double areaResult = circle.getArea();
		assertEquals(79.0, areaResult, 0.01);
		double perimeterResult = circle.getPerimeter();
		assertEquals(31.0, perimeterResult, 0.01);
	}

	@Test
	public void RectangleTest() {
		Shape rectangle = new Rectangle(5, 6);
		double areaResult = rectangle.getArea();
		assertEquals(30.0, areaResult, 0.01);
		double perimeterResult = rectangle.getPerimeter();
		assertEquals(22.0, perimeterResult, 0.01);
	}
	
	
	@Test
	public void TriangleTest() {
		Shape triangle = new Triangle(5, 6, 7);
		double areaResult = triangle.getArea();
		assertEquals(21.0, areaResult, 0.01);
		double perimeterResult = triangle.getPerimeter();
		assertEquals(18.0, perimeterResult, 0.01);
	}

}
