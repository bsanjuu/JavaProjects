public class WrapperClasses {
    public static void main(String[] args) {
        // Primitive data types
        Integer intPrimitive = 5;
        double doublePrimitive = 5.65;

        // Wrapper classes
        Integer intWrapper = Integer.valueOf(intPrimitive);
        Double doubleWrapper = Double.valueOf(doublePrimitive);

        // Printing the values
        System.out.println("Primitive int value: " + intPrimitive);
        System.out.println("Wrapper Integer value: " + intWrapper);
        System.out.println("Primitive double value: " + doublePrimitive);
        System.out.println("Wrapper Double value: " + doubleWrapper);

        // Autoboxing: automatic conversion of primitive to wrapper
        Integer autoBoxedInt = intPrimitive;
        Double autoBoxedDouble = doublePrimitive;

        // Unboxing: automatic conversion of wrapper to primitive
        int unboxedInt = intWrapper;
        double unboxedDouble = doubleWrapper;

        // Printing the values after autoboxing and unboxing
        System.out.println("Autoboxed Integer value: " + autoBoxedInt);
        System.out.println("Autoboxed Double value: " + autoBoxedDouble);
        System.out.println("Unboxed int value: " + unboxedInt);
        System.out.println("Unboxed double value: " + unboxedDouble);
    }
}