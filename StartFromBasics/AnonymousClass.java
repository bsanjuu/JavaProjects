abstract  class A  //we can create a anonymous class object for abstract class 
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
		System.out.println("in B Show");
	}
}

public class  AnonymousClass{
    public static void main(String[] args) {
    	
    	
    	A obj=new A() 
    	{
    		public void show()
    		{
    			System.out.println("in new show");
    		}
    	};
    	obj.show();
    }
}
