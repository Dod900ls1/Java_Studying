package Lab3_1;

import Lab3_2.ThreeDimentional;
import Lab3_2.TwoDimentional;

public class ExcersiceShapes {

	public static void main(String[] args) {
		Shape[] shape = new Shape[8];
		shape[0] = new Box(5, 6, 7);
		shape[1] = new Box(5, 3, 2);
		shape[2] = new Rectangle(6, 5);
		shape[3] = new Rectangle(3, 7);
		shape[4] = new Cube(5);
		shape[5] = new Cube(6);
		shape[6] = new Square(5);
		shape[7] = new Square(6);
		
		
		TwoDimentional[] twoDs = new TwoDimentional[3];	
		twoDs[0] = new Circle(3);
		twoDs[1] = new Square(4);
		twoDs[2] = new Rectangle(4, 5);
		
		for(TwoDimentional i: twoDs) {
			System.out.printf("Area = %.2f, Perimeter = %.2f\n",i.getArea(), i.getPerimiter());
		}
		for(Shape i: shape) {
			if(i instanceof ThreeDimentional) {
				ThreeDimentional temp = (ThreeDimentional) i;
				System.out.printf("Volume = %.2f\n", temp.getVolume());
			}

		}
	}
}
