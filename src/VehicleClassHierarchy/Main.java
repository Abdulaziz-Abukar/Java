/*
Create a Vehicle Class Hierarchy:

Create a superclass Vehicle with common properties like make and year, and a method displayInfo().
Create subclasses Car and Bike that extend Vehicle and add specific properties;
like numberOfDoors for Car and type for Bike.
 */

package VehicleClassHierarchy;

import package1.B;
import package2.C;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Honda", 2020);
        Car car1 = new Car("Honda", 2021, 4);
        Bike bike1 = new Bike("Yamaha", 2015, "Rover");

//        car1.setNumberOfDoors(2);
//
//        car1.displayInfo();

        bike1.displayInfo();

    }
}
