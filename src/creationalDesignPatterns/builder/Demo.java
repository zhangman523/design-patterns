package creationalDesignPatterns.builder;

import creationalDesignPatterns.builder.builders.CarBuilder;
import creationalDesignPatterns.builder.builders.CarManualBuilder;
import creationalDesignPatterns.builder.car.Car;
import creationalDesignPatterns.builder.car.Manual;
import creationalDesignPatterns.builder.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();

        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car build:\n " + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual build:\n" + carManual.print());
    }
}
