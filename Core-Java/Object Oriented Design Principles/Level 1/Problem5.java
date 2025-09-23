import java.util.*;

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }
}

class Course {
    String courseName;
    Professor professor;
    List<StudentUMS> students;

    Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println("Professor " + p.name + " assigned to " + courseName);
    }

    void enrollStudent(StudentUMS s) {
        students.add(s);
        System.out.println("Student " + s.name + " enrolled in " + courseName);
    }

    void showDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.name : "None"));
        System.out.println("Enrolled Students:");
        for (StudentUMS s : students) {
            System.out.println("- " + s.name);
        }
    }
}

class StudentUMS {
    String name;

    StudentUMS(String name) {
        this.name = name;
    }

    void enrollCourse(Course c) {
        c.enrollStudent(this);
    }
}

public class Problem5 {
    public static void main(String[] args) {
        Professor prof = new Professor("Dr. Sharma");
        Course c1 = new Course("Java Programming");
        StudentUMS s1 = new StudentUMS("Aanya");
        StudentUMS s2 = new StudentUMS("Vedansh");

        // Assign professor
        c1.assignProfessor(prof);

        // Students enroll
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);

        // Show details
        c1.showDetails();
    }
}
