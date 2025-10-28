// Insurable interface
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract Vehicle
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle: " + type + ", No: " + vehicleNumber + ", Rate: " + rentalRate);
    }
}

// Car
class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) { super(num, "Car", rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days; }
    @Override public double calculateInsurance() { return 1000; }
    @Override public String getInsuranceDetails() { return "Flat Car Insurance: 1000"; }
}

// Bike
class Bike extends Vehicle implements Insurable {
    public Bike(String num, double rate) { super(num, "Bike", rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days * 0.8; } // cheaper
    @Override public double calculateInsurance() { return 300; }
    @Override public String getInsuranceDetails() { return "Bike Insurance: 300"; }
}

// Truck
class Truck extends Vehicle implements Insurable {
    public Truck(String num, double rate) { super(num, "Truck", rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days + 2000; }
    @Override public double calculateInsurance() { return 5000; }
    @Override public String getInsuranceDetails() { return "Truck Insurance: 5000"; }
}

// Main
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("C101", 2000),
            new Bike("B202", 500),
            new Truck("T303", 5000)
        };

        for (Vehicle v : vehicles) {
            v.displayDetails();
            double cost = v.calculateRentalCost(5);
            double insurance = ((Insurable)v).calculateInsurance();
            System.out.println("Rental for 5 days: " + cost);
            System.out.println("Insurance: " + insurance);
            System.out.println(((Insurable)v).getInsuranceDetails());
            System.out.println("-------------------");
        }
    }
}
