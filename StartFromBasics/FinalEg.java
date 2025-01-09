//final - variable, method, class

//final class Calc
//{
//	public void show()
//	{
//		System.out.println("in Calc show");
//	}
//	public void add(int a, int b)
//	{
//		System.out.println(a+b);
//	}
//}


/*final */ 
class Calc
{
	public /*final */ void show()
	{
		System.out.println("By Calc");
	}
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
}

class AdvCalc  extends Calc
{
	public void show()
	{
		System.out.println("By AdvCalc");
	
    }
}

	
        
    


public class FinalEg {
    public static void main(String[] args) {
        AdvCalc obj= new AdvCalc();
    	obj.show();
        Calc c = new Calc();
    	c.add(4, 5);

    }
}
