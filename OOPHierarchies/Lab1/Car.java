package Lab1;

import java.time.LocalDate;
import java.time.Period;

class Car {
	
	public Car() {}
	public Car(String name) {
		this.setName(name);
	}
	public Car(String name, int speed, int fuel, boolean engineState) {
		this(name);
		this.setSpeed(speed);
		this.setFuel(fuel);
		this.setEngine(engineState);
	}
	
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private int speed;
    private int fuel;
    private boolean engine;

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getFuel() {
        return fuel;
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    public boolean isEngine() {
        return engine;
    }
    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    private LocalDate manufactured;

    public LocalDate getManufactured() {
        return manufactured;
    }

    public void setManufactured(LocalDate manufactured) {
        this.manufactured = manufactured;
    }

    public int getAge() {
		return Period.between(manufactured, LocalDate.now()).getYears();
	}

}