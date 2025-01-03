class Human {
private int age;
private String name;
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
}
 

public class EncapsEg
{
    public static void main(String[] args) {
        Human h=new Human();
        h.setAge(25);
        h.setName("John");
        
        System.out.println(h.getName()+" "+h.getAge());

    }
}
