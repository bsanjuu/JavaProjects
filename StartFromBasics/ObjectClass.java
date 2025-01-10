class Laptop
{
	String model;
	int price;
//	String serial;
	
	public String toString()
	{
		return model+ " : "+price;
	}
	public boolean equals(Laptop that)
	{
//		if(this.model.equals(that.model) && this.price==that.price) 
//			return true;
//		else
//			return false;
		
		return this.model.equals(that.model) && this.price==that.price ;
	}
}
	
public class  ObjectClass{
    public static void main(String[] args) {

    	Laptop obj=new Laptop();
    	obj.model="Macbook Air";
    	obj.price=1000;
    	
    	Laptop obj2=new Laptop();
    	obj2.model="Macbook Air";
    	obj2.price=1000;
    	boolean result = obj.equals(obj2);    	
    	System.out.println(obj2.toString());
        System.out.println(result);

    	
    }
}
