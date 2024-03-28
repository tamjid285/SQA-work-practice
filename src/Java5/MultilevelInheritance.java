package Java5;

// Base class (Level 1)
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

// Derived class 1 (Level 2)
class Bird extends Animal {
    void fly() {
        System.out.println("Bird is flying.");
    }
}

// Derived class 2 (Level 3)
class Sparrow extends Bird {
    void chirp() {
        System.out.println("Sparrow is chirping.");
    }
}

// Derived class 3 (Level 4)
class FlyingSparrow extends Sparrow {
    void soar() {
        System.out.println("FlyingSparrow is soaring high.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        // Creating objects of the derived classes
        Sparrow sparrow = new Sparrow();
        FlyingSparrow flyingSparrow = new FlyingSparrow();

        // Calling methods from the base class
        sparrow.eat();
        sparrow.sleep();

        flyingSparrow.eat();
        flyingSparrow.sleep();

        // Calling methods specific to the intermediate and derived classes
        sparrow.fly();
        sparrow.chirp();

        flyingSparrow.fly();
        flyingSparrow.chirp();
        flyingSparrow.soar();
    }
}
