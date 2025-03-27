class Sanju
{
    private    int rollno;
    private int age;
    private String name;
    Sanju(int rollno, int age, String name) {
        this.rollno = rollno;
        this.age = age;
        this.name = name;
    }
    Sanju()
    {

    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

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
public  class Hari extends Sanju
{
    public static void main(String[] args) {

        Sanju sanju = new Sanju();
        sanju.setAge(18);
        sanju.setName("Sanju");
        sanju.setRollno(10);

        System.out.println("Roll No: " + sanju.getRollno() + ", Age: " + sanju.getAge() + ", Name: " + sanju.getName());
    }


}
