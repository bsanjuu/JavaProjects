public class ArithmeticExp {
    public static void main(String[] args) {
        int x=10;
        x +=2;//Augumented Arthimetic Operation
        System.out.println(x);

        int n=10+3*2;

        /*

        Order of arithmetic Operators
            1.Parentheses.
            2.Multiplication and division.
            3.Addition and subtraction.
         */
        System.out.println(n);

        //Casting
        String s="83";
        int cast=Integer.parseInt(s);
        System.out.println(cast);
        double d=Double.parseDouble(s);
        System.out.println(d);

    }
}
