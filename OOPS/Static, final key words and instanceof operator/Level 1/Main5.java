class Student {
    // Static variable
    static String universityName = "Delhi University";
    static int totalStudents = 0;

    // Final variable
    final int rollNumber;

    // Instance variables
    String name;
    String grade;

    // Constructor using 'this'
    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Static method
    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Display details using instanceof
    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("Name: " + name + ", Roll No: " + rollNumber + ", Grade: " + grade);
        }
    }
}

public class Main5 {
    public static void main(String[] args) {
        Student s1 = new Student("Aanya", 101, "A");
        Student s2 = new Student("Vedansh", 102, "B");

        s1.displayDetails();
        s2.displayDetails();

        Student.displayTotalStudents();
    }
}
