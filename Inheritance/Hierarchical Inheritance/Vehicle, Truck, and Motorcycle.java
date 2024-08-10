class Vehicle {
    String color;
    int maxSpeed;

    Vehicle(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}

class Truck extends Vehicle {
    int numWheels;

    Truck(String color, int maxSpeed, int numWheels) {
        super(color, maxSpeed);
        this.numWheels = numWheels;
    }
}

class Motorcycle extends Vehicle {
    int engineSize;

    Motorcycle(String color, int maxSpeed, int engineSize) {
        super(color, maxSpeed);
        this.engineSize = engineSize;
    }
}

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("Red", 120, 18);
        Motorcycle motorcycle = new Motorcycle("Blue", 150, 650);
        System.out.println("Truck: ");
        System.out.println("Color: " + truck.color);
        System.out.println("Max Speed: " + truck.maxSpeed);
        System.out.println("Number of Wheels: " + truck.numWheels);
        System.out.println("Motorcycle: ");
        System.out.println("Color: " + motorcycle.color);
        System.out.println("Max Speed: " + motorcycle.maxSpeed);
        System.out.println("Engine Size: " + motorcycle.engineSize);
    }
}
