package Lab1_1;

/**
 * A Test Driver for the Lab1_1.Circle class
 */
public class TestCircle {
    public static void main(String[] args) {
        // Test default constructor
        Circle c1 = new Circle();
        System.out.println("Lab1_1.Circle 1: " + c1);

        // Test constructor with radius
        Circle c2 = new Circle(2.5);
        System.out.println("Lab1_1.Circle 2: " + c2);

        // Test constructor with radius and color
        Circle c3 = new Circle(3.0, "blue");
        System.out.println("Lab1_1.Circle 3: " + c3);

        // Test setters
        c1.setRadius(5.5);
        c1.setColor("green");
        System.out.println("Updated Lab1_1.Circle 1: " + c1);

        // Test getters
        System.out.println("Radius of Lab1_1.Circle 2: " + c2.getRadius());
        System.out.println("Color of Lab1_1.Circle 3: " + c3.getColor());

        // Test getArea()
        System.out.println("Area of Lab1_1.Circle 3: " + c3.getArea());
    }
}
