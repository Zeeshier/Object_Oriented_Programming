class Animal {
    String species;

    Animal(String species) {
        this.species = species;
    }
}

class Mammal extends Animal {
    int numLegs;

    Mammal(String species, int numLegs) {
        super(species);
        this.numLegs = numLegs;
    }
}

class Dog extends Mammal {
    String breed;

    Dog(String species, int numLegs, String breed) {
        super(species, numLegs);
        this.breed = breed;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Canis lupus familiaris", 4, "Golden Retriever");
        System.out.println("Species: " + dog.species);
        System.out.println("Number of Legs: " + dog.numLegs);
        System.out.println("Breed: " + dog.breed);
    }
}
