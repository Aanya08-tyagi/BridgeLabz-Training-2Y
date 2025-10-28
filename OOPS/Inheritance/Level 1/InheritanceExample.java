// Superclass
abstract class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }

    // Abstract method → must be implemented by subclass
    public abstract void makeSound();
}

// Subclass (Dog is-a Animal)
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Subclass (Cat is-a Animal)
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

// Test
public class InheritanceExample {
    public static void main(String[] args) {
        Animal a1 = new Dog();  // Polymorphism
        Animal a2 = new Cat();

        a1.eat();        // Inherited method
        a1.makeSound();  // Overridden method

        a2.eat();
        a2.makeSound();
    }
}
