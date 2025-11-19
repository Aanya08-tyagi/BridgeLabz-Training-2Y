class Patient {
    // Static variable
    static String hospitalName = "Apollo Hospital";
    static int totalPatients = 0;

    // Final variable
    final int patientID;

    // Instance variables
    String name;
    int age;
    String ailment;

    // Constructor using 'this'
    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // Static method
    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    // Display details using instanceof
    void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID + ", Name: " + name + 
                               ", Age: " + age + ", Ailment: " + ailment);
        }
    }
}

public class Main7 {
    public static void main(String[] args) {
        Patient p1 = new Patient(1, "Aanya", 22, "Fever");
        Patient p2 = new Patient(2, "Vedansh", 25, "Injury");

        p1.displayDetails();
        p2.displayDetails();

        Patient.getTotalPatients();
    }
}
