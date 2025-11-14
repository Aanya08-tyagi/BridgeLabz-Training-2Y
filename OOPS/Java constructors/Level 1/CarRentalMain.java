
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000; // fixed rate per day

    // Default constructor
    CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void displayRental() {
        System.out.println("Customer: " + customerName +
                ", Car: " + carModel +
                ", Days: " + rentalDays +
                ", Total Cost: " + calculateTotalCost());
    }
}

public class CarRentalMain {
    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Alice", "SUV", 5);

        r1.displayRental();
        r2.displayRental();
    }
}
