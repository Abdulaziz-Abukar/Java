package ElectronicsHierarchy;

public class Computer extends Device{
    int ram;
    int storage;

    void bootUp() {
        System.out.println("BOOTED UP");
    }

    void shutDown() {
        System.out.println("SHUT DOWN");
    }
}
