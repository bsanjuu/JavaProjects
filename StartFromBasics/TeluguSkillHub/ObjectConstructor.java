class University
{
    String name;
    public University()
    {
        System.out.println("University constructor Assigned");
    }
    public University(String name)
    {
        this.name=name;
        System.out.println("University constructor Assigned with name");
    }
    

}
public class ObjectConstructor {
    public static void main(String[] args) {
        University u=new University();
        University u1=new University("AUM");
        System.out.println(u1.name);
    }

}
