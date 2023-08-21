package Lab3_1;

import Lab3_2.TwoDimentional;

public class Circle extends Shape implements TwoDimentional {

	
	private double radius;
	public Circle(double radius) {
		setRadius(radius);
	}
	
	public Circle(double radius, String name, String color) {
		this(radius);
		super.setColor(color);
		super.setName(name);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*getRadius()*getRadius();
	}

	@Override
	public double getPerimiter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*getRadius();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circle [getColor()=");
		builder.append(getColor());
		builder.append(", Radius = ");
		builder.append(getRadius());
		builder.append(", getName()=");
		builder.append(getName());
		builder.append("]");
		return builder.toString();
	}

}
