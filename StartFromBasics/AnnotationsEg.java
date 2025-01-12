class A
{
    void show()
    {
        System.out.println("A");
    }
}
class B extends A
{
    @Override //method name should be same to oveeride
    void show()
    {
        super.show();
        System.out.println("B");
       
    }
}


public class AnnotationsEg {
    public static void main(String[] args) {

        A a=new B();
        a.show();

        
    }
}
