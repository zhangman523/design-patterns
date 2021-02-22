package creationalDesignPatterns.builder.builders;

import creationalDesignPatterns.builder.car.CarType;
import creationalDesignPatterns.builder.components.Engine;
import creationalDesignPatterns.builder.components.GPSNavigator;
import creationalDesignPatterns.builder.components.Transmission;
import creationalDesignPatterns.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);

    void setSeats(int number);

    void setEngine(Engine engine);

    void setTripComputer(TripComputer computer);

    void setTransmission(Transmission transmission);

    void setGPSNavigator(GPSNavigator gps);
}
