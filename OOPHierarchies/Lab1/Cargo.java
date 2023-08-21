package Lab1;

public class Cargo extends Car {

	private int currentCragoLoad;
	private int cargoCapacity;

	public Cargo() {
		super();
	}

	public Cargo(String name) {
		super(name);
	}

	public int getCurrentCragoLoad() {
		return currentCragoLoad;
	}

	public void setCurrentCragoLoad(int currentCragoLoad) {
		this.currentCragoLoad = currentCragoLoad;
	}

	@Override
	public void setSpeed(int newSpeed) {
		super.setSpeed(newSpeed - getCurrentCragoLoad()/100);
	}

	public Cargo(String name, int speed, int fuel, boolean engineState) {
		super(name, speed, fuel, engineState);
	}

}