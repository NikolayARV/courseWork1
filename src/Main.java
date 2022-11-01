public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Ivanov Ivan Ivanovich", '1', 56236);
        employees[1] = new Employee("Ivanov Petr Petrovich", '2', 73569);
        employees[2] = new Employee("Ivanov Sidr Sidorovich", '3', 59864);
        employees[3] = new Employee("Petrov Petr Petrovich", '4', 87459);
        employees[4] = new Employee("Petrov Sidr Petrovich", '5', 32568);
        employees[5] = new Employee("Petrov Ivan Petrovich", '1', 48569);
        employees[6] = new Employee("Sidorov Sidor Sidorovich", '2', 48512);
        employees[7] = new Employee("Sidorov Ivan Sidorovich", '3', 23658);
        employees[8] = new Employee("Sidorov Petr Sidorovich", '4', 98563);
        employees[9] = new Employee("Sidorov Ivan Petrovich", '5', 56987);
        printListEmployees(employees);
        calculateSum(employees);
        findMinSalary(employees);
        findMaxSalary(employees);
        findAvrSalary(employees);
        printNameList(employees);

    }

    public static void printListEmployees(Employee[] employees) {

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void calculateSum(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц равна: " + sum + " рублей.");
    }

    public static void findMinSalary(Employee[] employees) {
        int min = employees[0].getSalary();
        String name = employees[0].getName();
        for (Employee employee : employees) {
            if (employee.getSalary() <= min)
                min = employee.getSalary();
            if (min == employee.getSalary())
                name = employee.getName();
        }
        System.out.println("Сотрудник " + name + " получает минимальную зарплату "
                + min + " рублей.");
    }


    public static void findMaxSalary(Employee[] employees) {
        int max = employees[0].getSalary();
        String name = employees[0].getName();
        for (Employee employee : employees) {
            if (employee.getSalary() >= max)
                max = employee.getSalary();
            if (max == employee.getSalary())
                name = employee.getName();
        }
        System.out.println("Сотрудник " + name + " получает максимальную зарплату " + max + " рублей");
    }

    public static void findAvrSalary(Employee[] employees) {
        float sum = 0.00f;
        float avr = 0.00f;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
            avr = sum / employees.length;
        }
        System.out.println("Средняя зарплата " + avr + " рублей");
    }

    public static void printNameList(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }


}








