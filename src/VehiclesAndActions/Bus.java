package VehiclesAndActions;

public class Bus extends Vehicle{

    @Override
    void start() {
        System.out.println("Bus has started.");
    }

    @Override
    void stop() {
        System.out.println("Bus has stopped.");
    }
}
