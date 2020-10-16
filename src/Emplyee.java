public class Emplyee {
    private String name;
    private String lastName;
    private double salary;

    public Emplyee(String name, String lastName, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
