package Lab1;

import java.time.LocalDate;

public class CarApp {

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
        
        StationWagon wagon = new StationWagon("Family Trukcer");
        wagon.setManufactured(LocalDate.of(1976, 2, 9));
        wagon.setCurrentCragoLoad(500);
        wagon.setSpeed(80);
        
        for(Car i: new Car[]{miniCooper, landRower, wagon}){
            System.out.printf("Car %s has been manufactured in %d and goes at %d mph.%n", i.getName(), i.getAge(), i.getSpeed());
        }
    }

}
