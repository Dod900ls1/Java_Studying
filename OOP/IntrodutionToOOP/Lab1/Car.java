package Lab1;
import java.time.LocalDate;
import java.time.Period;

class Car {
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

    public static void main(String[] args) {
        Car miniCooper = new Car();
        miniCooper.setSpeed(50);
        miniCooper.setFuel(20);
        miniCooper.setName("S501");
        miniCooper.setManufactured(LocalDate.of(2010, 8, 12));

        Car landRower = new Car();
        landRower.setSpeed(100);
        landRower.setFuel(40);
        landRower.setName("discovery");
        landRower.setManufactured(LocalDate.of(2016, 9, 11));
        
        for(Car i: new Car[]{miniCooper, landRower}){
            System.out.printf("Car %s has been manufactured in %d and goes at %d mph.%n", i.getName(), i.getAge(), i.getSpeed());
        }
    }
}