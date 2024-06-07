package VehicleClassHierarchy;

public class Bike extends Vehicle{
    private String type;

    public Bike(String make, int year, String type) {
        super(make, year);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: " + type);
    }
}
