public class Employee {
    private final String name;
    private char department;
    private int salary;
    private int id;


    public Employee(String name, char department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id=count;
        count++;

    }
    public static int count = 1;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(char department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " Name:" + name + " Department:" + department + " Salary: " + salary;
    }
}
