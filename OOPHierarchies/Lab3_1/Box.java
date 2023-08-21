package Lab3_1;
import Lab3_2.ThreeDimentional;

public class Box extends Shape implements ThreeDimentional{
	
    public Box(double length, double height, double width) {
        setLength(length);
        setHeight(height);
        setWidth(width);
    }

    public Box(double sideLength) {
        this(sideLength, sideLength, sideLength);
    }

    public Box() {
		// TODO Auto-generated constructor stub
	}
    
    public Box(String name, String color,
    		double length, double height, double width) {
    	this(length, height, width);
    	super.setColor(color);
    	super.setName(name);
    }
	
    @Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Box [height=");
		builder.append(height);
		builder.append(", width=");
		builder.append(width);
		builder.append(", length=");
		builder.append(length);
		builder.append(", getColor()=");
		builder.append(getColor());
		builder.append(", getName()=");
		builder.append(getName());
		builder.append("]");
		return builder.toString();
	}

	private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double width;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }



	public double getVolume() {
        return length * width * height;
    }

    public double getSurfaceArea() {
        return length * width * 2 + height * length * 4;
    }

    public static void main(String[] args) {
        Box box = new Box(5.6);
        Box rectangle = new Box(5.5, 2.5, 4.1);
        Box rectangle1 = new Cube(5.5);


        int c = 0;
        for (Box i : new Box[]{box, rectangle, rectangle1}) {
            c = c+1;
            System.out.printf("Box: %s", c);
            System.out.println();
            System.out.printf("length = %f%n", i.getLength());
            System.out.printf("width = %f%n", i.getWidth());
            System.out.printf("height = %f%n", i.getHeight());
            System.out.printf("volume = %f%n", i.getVolume());
            System.out.printf("surface area = %f%n", i.getSurfaceArea());
        }
    }
}