class Vehicle {
    // Static variable
    static double registrationFee = 5000;

    // Final variable
    final String registrationNumber;

    // Instance variables
    String ownerName, vehicleType;

    // Constructor using 'this'
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Display details using instanceof
    void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType +
                               ", Reg. Number: " + registrationNumber + 
                               ", Fee: " + registrationFee);
        }
    }
}

public class Main6 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Aanya", "Car", "DL01AB1234");
        Vehicle v2 = new Vehicle("Vedansh", "Bike", "DL02XY5678");

        v1.displayDetails();
        v2.displayDetails();

        Vehicle.updateRegistrationFee(7000);
        v1.displayDetails();
    }
}
