package Java5;

// Base class (Level 1)
class Animals {
    void eat() {
        System.out.println("Animal is eating.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

// Derived class 1 (Level 2)
class Birds extends Animal {
    void fly() {
        System.out.println("Bird is flying.");
    }
}

// Derived class 2 (Level 2)
class Dogs extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

// Derived class 3 (Level 2)
class Fish extends Animal {
    void swim() {
        System.out.println("Fish is swimming.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        // Creating objects of the derived classes
        Bird sparrow = new Bird();
        Dog beagle = new Dog();
        Fish goldfish = new Fish();

        // Calling methods from the base class
        sparrow.eat();
        sparrow.sleep();

        beagle.eat();
        beagle.sleep();

        goldfish.eat();
        goldfish.sleep();

        // Calling methods specific to the derived classes
        sparrow.fly();
        beagle.bark();
        goldfish.swim();
    }
}