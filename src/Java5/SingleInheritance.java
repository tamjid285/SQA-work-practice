package Java5;

// Base class (Parent class)
class Animal1 {
    void eat() {
        System.out.println("Animal is eating.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

// Derived class 1 (Child class)
class Bird1 extends Animal {
    void fly() {
        System.out.println("Bird is flying.");
    }
}

// Derived class 2 (Child class)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        // Creating objects of the derived classes
        Bird sparrow = new Bird();
        Dog beagle = new Dog();

        // Calling methods from the base class
        sparrow.eat();
        sparrow.sleep();

        beagle.eat();
        beagle.sleep();

        // Calling methods specific to the derived classes
        sparrow.fly();
        beagle.bark();
    }
}