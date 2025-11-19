import java.util.*;

class Course {
    String courseName;
    List<Student> enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    void showStudents() {
        System.out.println("Students in " + courseName + ":");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.name);
        }
    }
}

class Student {
    String name;
    List<Course> courses;

    Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void enroll(Course course) {
        courses.add(course);
        course.enrollStudent(this); // bidirectional association
    }

    void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}

class School {
    String schoolName;
    List<Student> students; // Aggregation: School has Students

    School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        School school = new School("Springfield High");

        Student s1 = new Student("Aanya");
        Student s2 = new Student("Vedansh");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        // Aggregation
        school.addStudent(s1);
        school.addStudent(s2);

        // Association
        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);

        school.showStudents();
        s1.showCourses();
        s2.showCourses();
        c1.showStudents();
        c2.showStudents();
    }
}
