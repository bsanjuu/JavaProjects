class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}
class AdvCalc extends Calc {
    public int mul(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("Error: Division by zero is not allowed");
            return 0; 
        } else {
            return n1 / n2;
        }
    }
}

public class InheritenceEg {
    public static void main(String[] args) {
        
        AdvCalc obj = new AdvCalc();

        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7, 3);
        int r3 = obj.mul(5, 3);
        int r4 = obj.div(15, 0); 


        System.out.println("Addition: " + r1);
        System.out.println("Subtraction: " + r2);
        System.out.println("Multiplication: " + r3);
        System.out.println("Division: " + r4);
    }
}
