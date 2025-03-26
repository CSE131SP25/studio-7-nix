package studio7;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double x, double y) {
		length = x;
		width = y;
	}
	public double theArea() {
		return length * width;
	}
	public boolean smallerThan(Rectangle RectangleTwo) {
		return this.theArea() < RectangleTwo.theArea();
	}
//Testing if the Rectangle is a Square
	if (x = y) {
		System.out.println("Yes, this Rectangle is a square");
	} else {
		System.out.println("No, this Rectangle is not a square");
	}
		
		
	}
	}
}
