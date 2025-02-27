class Calculator {
   
    int add(int a, int b)
    {
        return a+b;
    }
    double add(double a, double b)
    {
        return a+b;
    }


}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        
        // Calling the add method with integer arguments
        System.out.println(c.add(1, 2));
        
        // Calling the add method with double arguments
        System.out.println(c.add(1.0, 2.0));

        
    }
    
    
    
}
