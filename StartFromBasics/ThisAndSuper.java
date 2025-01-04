class A{

    public A()
    {
        System.out.println("in A");
    }
    public A(int n)
    {
        System.out.println("in A with int");
    }
}

class B extends A
{
    public B()
    {
        System.out.println("in B");
    }
    public B(int n)
    {
        System.out.println("in B with int");
    }

}

public class ThisAndSuper {
    public static void main(String[] args) {
        B b = new B();

    }
}
