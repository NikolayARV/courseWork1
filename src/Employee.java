public class Employee {
    private final String name;
    private char department;
    private float salary;
    private final int id;
    public static int count = 1;

    public Employee(String name, char department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = count++;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public void setDepartment(char department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {

        return id + " Name:" + name + " Department:" + department + " Salary: " + salary;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Employee employee = (Employee) other;
        return name.equals(((Employee) other).name);
    }

    @Override
    public int hashCode() {

        return java.util.Objects.hash(name);
    }
}

