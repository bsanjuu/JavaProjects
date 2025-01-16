class A{

    public A()
    {
        super();
        System.out.println("in A");
    }
    public A(int n)
    {
        super();
        System.out.println("in A with int");
    }
}

class B extends A
{
    public B()
    {
        super();
        System.out.println("in B");
    }
    public B(int n)
    {
		this();  //call constructor of same class
        System.out.println("in B with int");
    }

}

public class ThisAndSuper {
    public static void main(String[] args) {
       // B b = new B();
        B obj=new B(5);


    }
}
