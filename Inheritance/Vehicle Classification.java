public class Vehicle {
    String make;
    String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}

// Car
public class Car extends Vehicle {
    int numDoors;

    public Car(String make, String model, int numDoors) {
        super(make, model);
        this.numDoors = numDoors;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}

// SportsCar
public class SportsCar extends Car {
    int horsepower;

    public SportsCar(String make, String model, int numDoors, int horsepower) {
        super(make, model, numDoors);
        this.horsepower = horsepower;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Horsepower: " + horsepower);
    }

    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar("Chevrolet", "Corvette", 2, 600);
        sportsCar.displayInfo();
    }
}
