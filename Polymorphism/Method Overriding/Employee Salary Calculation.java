
class Employee {
    private String name;
    private double hourlyRate;

    Employee(String name, double hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        return hourlyRate * 40; 
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Hourly Rate: " + hourlyRate);
    }
}


class FullTimeEmployee extends Employee {
    private int hoursWorked;

    FullTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name, hourlyRate);
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary() * hoursWorked / 40;
    }
}


class PartTimeEmployee extends Employee {
    private int hoursWorked;

    PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name, hourlyRate);
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary() * hoursWorked / 40 * 0.5;
    }
}


class Contractor extends Employee {
    private double projectRate;

    Contractor(String name, double hourlyRate, double projectRate) {
        super(name, hourlyRate);
        this.projectRate = projectRate;
    }

    @Override
    double calculateSalary() {
        return projectRate;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new FullTimeEmployee("Ali", 20, 40);
        employee.displayInfo();
        System.out.println("Salary: " + employee.calculateSalary());

        employee = new PartTimeEmployee("Akbar", 20, 20);
        employee.displayInfo();
        System.out.println("Salary: " + employee.calculateSalary());

        employee = new Contractor("Zeeshan", 20, 1000);
        employee.displayInfo();
        System.out.println("Salary: " + employee.calculateSalary());
    }
}
