package BoxLab;

public class Cube extends Box {

	public Cube(double sideLength) {
		super(sideLength);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void setHeight(double height) {
		if(height != super.getHeight()) {
			super.setHeight(height);
			super.setLength(height);
			super.setWidth(height);
		}
	}
	
	@Override
	public void setWidth(double width) {
		setHeight(width);
	}
	@Override
	public void setLength(double length) {
		setHeight(length);
	}
	
	public void setSide(double side) {
		if(side > 0) {
			super.setHeight(side);
			super.setLength(side);
			super.setWidth(side);
		}
		else {
			super.setHeight(1);
			super.setLength(1);
			super.setWidth(1);
		}
	}
	
	public double	 getSide() {
		return super.getHeight();
	}
}
