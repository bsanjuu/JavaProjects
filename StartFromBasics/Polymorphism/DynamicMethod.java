//Dynamic Method Dispatch

class A
{
	public void show()
	{
		System.out.println("in A show");
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("in B show");
	}
}

class C extends A
{
	public void show()
	{
		System.out.println("in C show");
	}
}

class D extends A
{
	public void show()
    {
        System.out.println("in D show");
    }
}


public class DynamicMethod {
    public static void main(String[] args) {
		
		A obj=new A();
		obj.show();
		
		obj=new B();
		obj.show();
		
		obj=new C();
		obj.show();
        
        obj=new D();
		obj.show();

    } 
}
