package creationalDesignPatterns.builder.builders;

import creationalDesignPatterns.builder.car.Car;
import creationalDesignPatterns.builder.car.CarType;
import creationalDesignPatterns.builder.components.Engine;
import creationalDesignPatterns.builder.components.GPSNavigator;
import creationalDesignPatterns.builder.components.Transmission;
import creationalDesignPatterns.builder.components.TripComputer;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setType(CarType type) {
        this.type = type;
    }


    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int number) {
        this.seats = number;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTripComputer(TripComputer computer) {
        this.tripComputer = computer;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gps) {
        this.gpsNavigator = gps;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
