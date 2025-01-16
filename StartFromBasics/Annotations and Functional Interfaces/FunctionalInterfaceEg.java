// interface A{
//     void display();
// }
// public class FunctionalInterfaceEg {
//     public static void main(String[] args) {
//         A a=()-> System.out.println("in display");
//         a.display();
//     }

// }

/*Types of Interface:-
1. Normal interface
	- an interface having two or more methods
2. Functional interface (SAM)
	- SAM => Single Abstract Method interface
3. Marker interface
	- an interface that as no methods (blank interface)

*/


interface B
{
    int add(int a,int b);
}
public class FunctionalInterfaceEg {
    public static void main(String[] args) {
    B bu=(a,b)->a+b;
    System.out.println(bu.add(10, 20));
    
    }
}
