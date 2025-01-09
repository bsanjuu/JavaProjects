//Polymorphism:
//- Many behaviour ( same object or reference has differnet behaviours)

// 1. Compile time polymorhism -- Overloading
// 	add(int, int)
// 	add(int, int, int)

// 2. Run time polymorphism -- Overriding
// 	A
// 		add(int,int)
// 	B
// 		add(int, int)



public class Polym {

    int add(int a, int b)
    {
        return a+b;
    }
    int add(int a, int b, int c)
    {
        return a+b+c;
    }


    public static void main(String[] args) {
        
        Polym p = new Polym();
        System.out.println(p.add(10, 20)); 
        System.out.println(p.add(10, 20, 30)); 

    }
    
}
