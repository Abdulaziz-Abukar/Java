package ElectronicsHierarchy;

public class MobilePhone extends Device{
    double screenSize;
    int batteryLife;

    void makeCall() {
        System.out.println("Calling...");
    }

    void sendMessage() {
        System.out.println("Sending Message..");
    }
}
