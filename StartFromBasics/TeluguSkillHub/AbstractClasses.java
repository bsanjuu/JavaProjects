abstract class Animal {
    public abstract void makeSound();
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); 

        Animal myCat = new Cat();
        myCat.makeSound();
        

    }
}
