// Parent class (Superclass)
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

// Child class (Subclass) that overrides the add method
class AdvancedCalculator extends Calculator {
    @Override
    int add(int a, int b) {
        System.out.println("Using overridden method in AdvancedCalculator");
        return a + b + 10;  // Modified behavior
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println("Calculator: " + c1.add(1, 2)); // Calls superclass method

        AdvancedCalculator c2 = new AdvancedCalculator();
        System.out.println("AdvancedCalculator: " + c2.add(1, 2)); // Calls overridden method
    }
}
