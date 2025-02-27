class Animal {
    String Type;
    int lifeSpan;

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

}
class Dog extends Animal
{
    String breed;
    String color;


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
class Cat extends Animal
{
    String breed;
    String color;
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }


}





public class Inheritences {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setType("Dog");
        dog.setLifeSpan(15);
        dog.setBreed("German Shepherd");
        dog.setColor("Black");

        Cat cat = new Cat();
        cat.setType("Cat");
        cat.setLifeSpan(12);
        cat.setBreed("Persian");
        cat.setColor("White");

        System.out.println("Dog Details:");
        System.out.println("Type: " + dog.getType());
        System.out.println("Life Span: " + dog.getLifeSpan() + " years");
        System.out.println("Breed: " + dog.getBreed());
        System.out.println("Color: " + dog.getColor());

        System.out.println("Cat Details:");
        System.out.println("Cat Type: " + cat.getType());
        System.out.println("Cat Life Span: " + cat.getLifeSpan() + " years");
        System.out.println("Cat Breed: " + cat.getBreed());
        System.out.println("Cat Color: " + cat.getColor());
    }
}
