package Lab1_3;

public class Rectangle {
    // Private instance variables
    private float length;
    private float width;

    // Default constructor
    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    // Constructor with parameters
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // Getter for length
    public float getLength() {
        return length;
    }

    // Setter for length
    public void setLength(float length) {
        this.length = length;
    }

    // Getter for width
    public float getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(float width) {
        this.width = width;
    }

    // Method to calculate area
    public double getArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // toString method
    @Override
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
}
