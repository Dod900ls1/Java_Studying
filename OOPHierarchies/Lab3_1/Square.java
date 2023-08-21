package Lab3_1;

public class Square extends Rectangle {

	public Square(double side) {
		super(side, side);
		// TODO Auto-generated constructor stub
	}
	
	public Square(double side, String color,
			String name) {
		super(side, side);
		super.setColor(color);
		super.setName(name);
		// TODO Auto-generated constructor stub
	}
	
	public Square() {
		// TODO Auto-generated constructor stub
	}


}
