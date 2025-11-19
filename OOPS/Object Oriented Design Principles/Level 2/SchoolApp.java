import java.util.*;

class Subject {
    String subjectName;
    int marks;

    Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }
}

class Student {
    String name;
    int rollNo;
    List<Subject> subjects = new ArrayList<>();

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void addSubject(Subject s) {
        subjects.add(s);
    }

    List<Subject> getSubjects() {
        return subjects;
    }
}

class GradeCalculator {
    char calculateGrade(Student s) {
        int total = 0;
        for (Subject sub : s.getSubjects()) {
            total += sub.getMarks();
        }
        int avg = total / s.getSubjects().size();

        if (avg >= 90) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 50) return 'C';
        else return 'F';
    }

    void displayResult(Student s) {
        char grade = calculateGrade(s);
        System.out.println("Student: " + s.name + " | Grade: " + grade);
    }
}

public class SchoolApp {
    public static void main(String[] args) {
        Student john = new Student("John", 101);
        john.addSubject(new Subject("Maths", 90));
        john.addSubject(new Subject("Science", 85));

        GradeCalculator calc = new GradeCalculator();
        calc.displayResult(john);
    }
}
