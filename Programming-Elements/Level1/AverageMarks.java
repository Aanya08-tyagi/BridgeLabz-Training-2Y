public class AverageMarks {
    public static void main(String[] args) {
        int maths = 94, physics = 95, chemistry = 96;
        int totalSubjects = 3;

        double average = (maths + physics + chemistry) / (double) totalSubjects;

        System.out.println("Sam’s average mark in PCM is " + average);
    }
}
