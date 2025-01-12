public class ExceptionHandling {
    
    public static void main(String[] args) {
    int a=0;
    int b=0;
   
    try
    {
    	b=10/a;
    }
    catch(Exception e)
    {
    	System.out.println("Something went wrong "+e);
    }
    System.out.println(b);
    
    }
    
}
