import java.util.*;

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;
    List<Patient> patients;

    Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    void consult(Patient p) {
        patients.add(p);
        System.out.println("Doctor " + name + " is consulting Patient " + p.name);
    }

    void showPatients() {
        System.out.println("Patients of Dr. " + name + ":");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

class Hospital {
    String hospitalName;

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Apollo Hospital");

        Doctor d1 = new Doctor("Dr. Singh");
        Doctor d2 = new Doctor("Dr. Gupta");

        Patient p1 = new Patient("Aanya");
        Patient p2 = new Patient("Vedansh");

        // Communication
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        d1.showPatients();
        d2.showPatients();
    }
}
