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
        increaseSalary(employees, 10);
        inDepfindMinSalary(employees, '5');
        inDepfindMaxSalary(employees, '4');
        inDepfindSumSalary(employees, '3');
        inDepfindAvrSalary(employees, '2');
        increaseDepSalary(employees, '1', 10);
        printDepNames(employees, '5');
        comparisonSalaryWithNumber(employees, 50000);

    }

    public static void printListEmployees(Employee[] employees) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                System.out.println(employees[i]);
            else continue;
        }
    }

    public static void calculateSum(Employee[] employees) {
        float sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                sum = sum + employees[i].getSalary();
            else continue;
        }
        System.out.println("Сумма затрат на зарплаты в месяц равна: " + sum + " рублей.");
    }

    public static void findMinSalary(Employee[] employees) {
        float min = employees[0].getSalary();
        String name = employees[0].getName();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() <= min)
                    min = employees[i].getSalary();
                if (min == employees[i].getSalary())
                    name = employees[i].getName();
            } else continue;

        }
        System.out.println("Сотрудник " + name + " получает минимальную зарплату "
                + min + " рублей.");
    }


    public static void findMaxSalary(Employee[] employees) {
        float max = employees[0].getSalary();
        String name = employees[0].getName();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() >= max)
                    max = employees[i].getSalary();
                if (max == employees[i].getSalary())
                    name = employees[i].getName();
            } else continue;
        }
        System.out.println("Сотрудник " + name + " получает максимальную зарплату " + max + " рублей");
    }

    public static void findAvrSalary(Employee[] employees) {
        float sum = 0.00f;
        float avr = 0.00f;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                sum = sum + employees[i].getSalary();
            avr = sum / employees.length;
        }
        System.out.println("Средняя зарплата " + avr + " рублей");
    }

    public static void printNameList(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                System.out.println(employees[i].getName());
        }
    }

    // индексация зарплат
    public static void increaseSalary(Employee[] employees, float percent) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].setSalary((employees[i].getSalary()) * (1 + (percent / 100)));
            } else continue;
        }
    }

    // сотрудник с минимальной зарплатой в отделе
    public static void inDepfindMinSalary(Employee[] employees, char depNumber) {
        float min = employees[0].getSalary();
        String name = employees[0].getName();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && depNumber == employees[i].getDepartment()) {
                if (employees[i].getSalary() <= min)
                    min = employees[i].getSalary();
                if (min == employees[i].getSalary())
                    name = employees[i].getName();
            } else continue;
        }
        System.out.println("Сотрудник " + name + " получает минимальную зарплату "
                + min + " рублей.");
    }

    // сотрудник с минимальной зарплатой в отделе
    public static void inDepfindMaxSalary(Employee[] employees, char depNumber) {
        float max = employees[0].getSalary();
        String name = employees[0].getName();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && depNumber == employees[i].getDepartment()) {
                if (employees[i].getSalary() >= max)
                    max = employees[i].getSalary();
                if (max == employees[i].getSalary())
                    name = employees[i].getName();
            } else continue;
        }
        System.out.println("Сотрудник " + name + " получает минимальную зарплату "
                + max + " рублей.");
    }

    // Сумму затрат на зарплату по отделу.
    public static void inDepfindSumSalary(Employee[] employees, char depNumber) {
        float sum = 0.0f;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && depNumber == employees[i].getDepartment()) {
                sum = sum + employees[i].getSalary();
            } else continue;
        }
        System.out.println("Сумму затрат на зарплату по отделу №" + depNumber + " " + sum + " рублей.");
    }

    //Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length)
    public static void inDepfindAvrSalary(Employee[] employees, char depNumber) {
        float sum = 0.0f;
        float avr = 0.0f;
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && depNumber == employees[i].getDepartment()) {
                sum = sum + employees[i].getSalary();
                count++;
                avr = sum / count;
            } else continue;
        }
        System.out.println("Средняя зарплата по отделу №" + depNumber + " " + avr + " рублей.");
    }

    // Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
    public static void increaseDepSalary(Employee[] employees, char depNumber, float percent) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && depNumber == employees[i].getDepartment()) {
                employees[i].setSalary((employees[i].getSalary()) * (1 + (percent / 100)));
            } else continue;
            System.out.println(employees[i].getSalary());
        }
    }

    //Напечатать всех сотрудников отдела (все данные, кроме отдела).
    public static void printDepNames(Employee[] employees, char depNumber) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && depNumber == employees[i].getDepartment()) {
                System.out.println("ID " + employees[i].getId() + " Имя " + employees[i].getName() + " Зарплата " + employees[i].getSalary() + " рублей");
            } else continue;
        }
    }

    //Получить в качестве параметра число и найти:
    //    1. Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
    //    2. Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).
    public static void comparisonSalaryWithNumber(Employee[] employees, int number) {
        System.out.println("Сотрудники с зарплатой ниже " + number);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < number) {
                System.out.println("ID " + employees[i].getId() + " Имя " + employees[i].getName() + " Зарплата " + employees[i].getSalary() + " рублей");
            } else continue;
        }
        System.out.println("Сотрудники с зарплатой выше или равно " + number);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() >= number) {
                System.out.println("ID " + employees[i].getId() + " Имя " + employees[i].getName() + " Зарплата " + employees[i].getSalary() + " рублей");
            } else continue;
        }
    }
}








