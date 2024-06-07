package VehiclesAndActions;

public class Bike extends Vehicle{

    @Override
    void start() {
        System.out.println("Bike has started.");
    }

    @Override
    void stop() {
        System.out.println("Bike has stopped.");
    }
}
