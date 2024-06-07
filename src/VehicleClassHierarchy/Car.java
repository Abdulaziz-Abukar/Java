package VehicleClassHierarchy;

class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String make, int year, int numberOfDoors) {
        super(make, year); // call the constructor of the superclass.
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // call the super class method.
        System.out.println("Number of doors: " + numberOfDoors);
    }
}
