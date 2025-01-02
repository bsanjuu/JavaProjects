class Students
{
    String name;
    int roll;
    //String cls;

    //Variable Example
    static String cls;

    public void display()
    {
        System.out.println("Name: "+name+" Roll: "+roll+" Class: "+cls);
    }
}


public class StaticEg {
    public static void main(String[] args) {
        Students student=new Students();
        student.name="Rahul";
        student.roll=10;
        student.cls="X";
        student.display();

        Students student1=new Students();
        student1.name="Rohan";
        student1.roll=20;
        student1.cls="X";
        student1.display();
       
        Students.cls="XI";
       
        student.display();
        student1.display();




    }
}
