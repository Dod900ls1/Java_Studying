package BoxLab;


public class CubeDriver {

	public CubeDriver() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Cube cube1 = new Cube(5.5);
		Cube cube2 = new Cube(-5);
		cube1.setSide(-1);
		int c = 0;
		for(Cube i: new Cube[] {cube1, cube2}) {
			c++;
			System.out.printf("Cube %d, length is %.2f\n", c, i.getLength());
			System.out.printf("Cube %d, width is %.2f\n", c, i.getWidth());
			System.out.printf("Cube %d, length is %.2f\n", c, i.getLength());
		}
		
	}
}
