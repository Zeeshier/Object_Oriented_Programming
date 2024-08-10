class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    String major;
    double gpa;

    Student(String name, int age, String major, double gpa) {
        super(name, age);
        this.major = major;
        this.gpa = gpa;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20, "Computer Science", 3.5);
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Major: " + student.major);
        System.out.println("GPA: " + student.gpa);
    }
}
