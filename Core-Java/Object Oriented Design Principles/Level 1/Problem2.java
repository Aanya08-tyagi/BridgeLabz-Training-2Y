import java.util.*;

class Department {
    String deptName;

    Department(String deptName) {
        this.deptName = deptName;
    }
}

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Faculty: " + name);
    }
}

class University {
    String universityName;
    List<Department> departments; // Composition
    List<Faculty> faculties;      // Aggregation

    University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void displayUniversity() {
        System.out.println("University: " + universityName);
        System.out.println("Departments:");
        for (Department d : departments) {
            System.out.println("- " + d.deptName);
        }
    }

    void deleteUniversity() {
        departments.clear(); // Composition → removing university deletes departments
        System.out.println("University deleted, all departments removed.");
    }
}

public class Problem2 {
    public static void main(String[] args) {
        University uni = new University("Delhi University");

        // Composition
        uni.addDepartment("Computer Science");
        uni.addDepartment("Mathematics");

        // Aggregation
        Faculty f1 = new Faculty("Prof. Sharma");
        Faculty f2 = new Faculty("Prof. Mehta");
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.displayUniversity();

        // Faculties exist independently
        f1.display();

        // Deleting university deletes its departments
        uni.deleteUniversity();
    }
}
