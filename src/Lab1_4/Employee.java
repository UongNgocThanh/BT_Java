package Lab1_4;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    // Setter
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Method to get annual salary
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Method to raise salary
    public int raiseSalary(int percent) {
        salary += salary * percent / 100;
        return salary;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
    }
}
