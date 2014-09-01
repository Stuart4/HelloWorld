/**
 * HelloWorld
 *
 * given input of radius, creates a wheel object
 *
 * @author Jacob Stuart
 * @lab
 * @date September 01, 2014
 */
public class Wheel {
	private double radius;

	Wheel(double radius) {
		this.radius = radius;
	}


	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return Math.PI * (Math.pow(radius, 2.0));
	}

	public double getCircumference() {
		return radius * 2.0 * Math.PI;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}
}
