// Interface for Department
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

// Abstract class Employee
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation - Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Abstract method (to be implemented by subclasses)
    public abstract double calculateSalary();

    // Concrete method (common functionality)
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}

// Full-time employee class
class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double allowance;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double allowance) {
        super(employeeId, name, baseSalary);
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + allowance;
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Allowance: " + allowance);
        System.out.println("Total Salary: " + calculateSalary());
        System.out.println(getDepartmentDetails());
        System.out.println("---------------------------");
    }
}

// Part-time employee class
class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Salary: " + calculateSalary());
        System.out.println(getDepartmentDetails());
        System.out.println("---------------------------");
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create employees
        Employee e1 = new FullTimeEmployee(101, "Alice", 50000, 10000);
        Employee e2 = new PartTimeEmployee(102, "Bob", 20000, 20, 500);

        // Assign departments (using interface methods)
        ((FullTimeEmployee) e1).assignDepartment("IT");
        ((PartTimeEmployee) e2).assignDepartment("HR");

        // Polymorphism: process employees via Employee reference
        Employee[] employees = { e1, e2 };

        for (Employee emp : employees) {
            emp.displayDetails();  // Polymorphic call
        }
    }
}
