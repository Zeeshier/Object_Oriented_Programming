class Animal {
    void sound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow!");
    }
}

class Bird extends Animal {
    @Override
    void sound() {
        System.out.println("Chirp!");
    }
}

public class AnimalSounds {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Animal();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Bird();
        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
