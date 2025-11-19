class Employee {
    // Static variable
    static String companyName = "Infosys";
    static int totalEmployees = 0;

    // Final variable
    final int id;

    // Instance variables
    String name, designation;

    // Constructor using 'this'
    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Display details using instanceof
    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Name: " + name + ", ID: " + id + ", Designation: " + designation);
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aanya", 1, "Developer");
        Employee e2 = new Employee("Vedansh", 2, "Manager");

        e1.displayDetails();
        e2.displayDetails();

        Employee.displayTotalEmployees();
    }
}
