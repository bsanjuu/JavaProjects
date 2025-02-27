

interface Animal 
{
    public void makeSound();
    public void eat();
}
interface Bird{
    public void fly();
}

class Dog implements Animal
{
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
class Cat implements Animal
{
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

}
class Mammals implements Animal, Bird
{
    @Override
    public void fly() {
        System.out.println("Mammals are flying");
    }
    @Override
    public void makeSound() {
        System.out.println("Mammals are making sound");
    }
    @Override
    public void eat() {
        System.out.println("Mammals are eating");
    }
    
}

public class Interfaces {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        dog.eat();
        Cat cat = new Cat();
        cat.makeSound();
        cat.eat();
        Mammals mammals = new Mammals();
        mammals.makeSound();
        mammals.eat();
        mammals.fly();



    }
}
