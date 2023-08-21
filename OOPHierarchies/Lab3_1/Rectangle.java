package Lab3_1;

import Lab3_2.TwoDimentional;

public class Rectangle extends Shape implements TwoDimentional {

	public Rectangle(double length, double width) {
		setLength(length);
		setWidth(width);
		super.setColor("White");
		super.setName("Uncknown");
	}
	
	public Rectangle(double length, double width, String color, String name) {
		this(length, width);
		super.setColor(color);
		super.setName(name);
	}
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rectangle [length=");
		builder.append(length);
		builder.append(", width=");
		builder.append(width);
		builder.append(", getColor()=");
		builder.append(getColor());
		builder.append(", getName()=");
		builder.append(getName());
		builder.append("]");
		return builder.toString();
	}

	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	private double length;
	@Override
	public double getArea() {
		return getWidth()*getLength();
	}

	@Override
	public double getPerimiter() {
		// TODO Auto-generated method stub
		return 2*getWidth()+2*getLength();
	}

	private double width;

}
