package VehicleClassHierarchy;

public class Vehicle {
    private String make;
    private int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake() {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear() {
        this.year = year;
    }

    public void displayInfo() {
        System.out.println(
                "Make: " + make + ", Year: " + year
        );
    }
}
