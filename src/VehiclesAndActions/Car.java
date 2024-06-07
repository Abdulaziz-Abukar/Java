package VehiclesAndActions;

public class Car extends Vehicle{

    @Override
    void start() {
        System.out.println("Car has started");
    }

    @Override
    void stop() {
        System.out.println("Car has stopped");
    }
}
