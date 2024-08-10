
abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateBonus();
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.1;
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.05;
    }
}
