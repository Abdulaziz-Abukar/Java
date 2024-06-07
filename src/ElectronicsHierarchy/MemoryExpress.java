/*
Exercise 2: Electronics Hierarchy
Description:
Create a class hierarchy for different types of electronic devices.

Device Class:
Fields: brand (String), model (String)
Methods: turnOn() (void), turnOff() (void)

Computer Class (inherits from Device):
Fields: ram (int), storage (int)
Methods: bootUp() (void), shutDown() (void)

MobilePhone Class (inherits from Device):
Fields: screenSize (double), batteryLife (int)
Methods: makeCall() (void), sendMessage() (void)

Laptop Class (inherits from Computer):
Fields: batteryBackup (int)
Methods: hibernate() (void)

Smartphone Class (inherits from MobilePhone):
Fields: os (String)
Methods: installApp() (void)
 */

package ElectronicsHierarchy;

public class MemoryExpress {
    public static void main(String[] args) {

        Device device = new Device();
        Computer computer = new Computer();

        computer.brand = "MSI";
        computer.model = "New";
        computer.ram = 16;
        computer.storage = 800;

        computer.turnOn();
        computer.bootUp();
    }
}
