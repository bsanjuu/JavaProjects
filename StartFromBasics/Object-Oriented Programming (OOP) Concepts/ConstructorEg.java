import java.time.LocalDate;

class Vehicle
{
    String name;
    int model;
    int year;
    public Vehicle()
    {
        year = LocalDate.now().getYear();
        System.out.println("Default Constructor");
    }
    public Vehicle(String name, int model)
    {
        this.name = name;
        this.model = model;
        System.out.println("Parameterized Constructor");
    }
}



public class ConstructorEg {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        Vehicle v1=new Vehicle("BMW",2);
        System.out.println("Year is :"+v.year);
        System.out.println("Name  :"+v1.name+" ,Model: "+v1.model+" ,Year: "+v.year);
        
    }
}
