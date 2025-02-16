package Lab1_1;

/**
 * The Lab1_1.Circle class models a circle with a radius and color.
 */
public class Circle {
    // Private instance variables
    private double radius;
    private String color;

    // Constructors (overloaded)
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter methods
    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    // Setter methods
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    @Override
    public String toString() {
        return "Lab1_1.Circle[radius=" + this.radius + ", color=" + this.color + "]";
    }
}
