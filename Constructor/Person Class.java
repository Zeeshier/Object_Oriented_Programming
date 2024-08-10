public class Person {
    private String name;
    private int age;
    private String city;

    // No-argument constructor
    public Person() {
        name = "Unknown";
        age = 0;
        city = "Unknown";
        System.out.println("No-argument constructor called");
    }

    // Constructor with name parameter
    public Person(String name) {
        this.name = name;
        age = 0;
        city = "Unknown";
        System.out.println("Constructor with name parameter called");
    }

    // Parameterized constructor
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
        System.out.println("Parameterized constructor called");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("John");
        Person person3 = new Person("Jane", 30, "Lahore");
    }
}
