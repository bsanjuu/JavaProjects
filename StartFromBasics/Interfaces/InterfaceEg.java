interface Computer
{
	 void price(int a);
	 void display();
}
interface Desktop{
	
	void model(String s);
}
class Laptop implements  Computer,Desktop
{

    
    public void price(int a) {
    	System.out.println(" Price : "+a);
    }

    
    public void display() {
        System.out.println("in display method");
    }
	public void model(String s)
		{
			System.out.println("Model :"+s);
		}
	
}



public class InterfaceEg {
    public static void main(String[] args) {
        
        Computer nComputer=new  Laptop();
		nComputer.price(10000);
		nComputer.display();
		
		Desktop nDesktop=new Laptop();
		nDesktop.model("2025");
        
        
    }
}