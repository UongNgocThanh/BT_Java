package Lab1_2;

/**
 * The Circle class models a circle with a radius.
 */
public class Circle {
    // Private instance variable
    private double radius = 1.0;

    // Constructors
    public Circle() {
        // Default constructor
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // toString method
    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
