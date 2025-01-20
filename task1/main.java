package task1; 

import java.util.Arrays;

class Employee {
    private String name;
    private double salary;
    private String dateOfBirth; // формат "гггг-мм-дд"

    public Employee(String name, double salary, String dateOfBirth) {
        this.name = name;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    // Метод для сравнения дат без условного оператора
    public static int compareDates(String date1, String date2) {
        int numericDate1 = Integer.parseInt(date1.replace("-", ""));
        int numericDate2 = Integer.parseInt(date2.replace("-", ""));
        return Integer.compare(numericDate1, numericDate2);
    }
}

class Manager extends Employee {
    public Manager(String name, double salary, String dateOfBirth) {
        super(name, salary, dateOfBirth);
    }

    // Статический метод повышения зарплаты для всех сотрудников, кроме руководителей
    public static void raiseSalaries(Employee[] employees, double percentage) {
        for (Employee emp : employees) {
            if (!(emp instanceof Manager)) {
                double newSalary = emp.getSalary() + emp.getSalary() * (percentage / 100);
                emp.setSalary(newSalary);
            }
        }
    }
}

public class main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 50000, "1985-06-15");
        Employee emp2 = new Employee("Bob", 60000, "1990-08-20");
        Manager mgr = new Manager("Charlie", 80000, "1982-01-10");

        Employee[] employees = {emp1, emp2, mgr};

        System.out.println("Before raise:");
        Arrays.stream(employees).forEach(e -> System.out.println(e.getName() + ": " + e.getSalary()));

        Manager.raiseSalaries(employees, 10); // Повышаем зарплату на 10%

        System.out.println("\nAfter raise:");
        Arrays.stream(employees).forEach(e -> System.out.println(e.getName() + ": " + e.getSalary()));
    }
}

