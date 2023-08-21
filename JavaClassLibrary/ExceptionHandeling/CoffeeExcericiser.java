package ExceptionHandeling;

public class CoffeeExcericiser {

	public CoffeeExcericiser() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws TooHotException {
		// TODO Auto-generated method stub
		Coffee coffee = null;
		try {
			coffee = new Coffee(125);
		}catch(TooHotException e) {
			System.out.println(e);
			coffee = new Coffee(0);
		}finally {
			System.out.println("Coffee is set to " + coffee.getTemperature());
		}

	}

}
