class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0); // chaining → calls parameterized constructor
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Radius: " + radius + ", Area: " + area);
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);

        c1.displayArea();
        c2.displayArea();
    }
}
