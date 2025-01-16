class A extends Object{
    int number=10;
}
class B extends A{
    int number=20;
    public int getValue()
    {
        int number=30;
        // return this.number;
        return  super.number;
    }
}

public class ThisVsSuper {
    public static void main(String[] args) {
        B b=new B();
        // System.out.println(b.getValue());
        System.out.println(b.getValue());
    }

}
