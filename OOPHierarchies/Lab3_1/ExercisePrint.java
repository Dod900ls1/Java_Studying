package Lab3_1;

public class ExercisePrint {

	public ExercisePrint() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Shape[] shapes = new Shape[5];
		shapes[0] = new Box("White", "Black", 5, 5, 5);
		shapes[1] = new Rectangle(5, 5, "White","Black");
		shapes[2] = new Square(5, "White", "Black");
		shapes[3] = new Cube(5, "White", "Black");
		shapes[4] = new Circle(4, "White", "Black");
		
		for(Shape shape: shapes) {
			System.out.println(shape);
		}
	}

}
