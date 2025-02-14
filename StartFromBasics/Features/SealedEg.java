sealed  class A permits B,C
{

}

final class B extends A
{

}
final class C extends A
{

}

class D extends A
{

}

class SealedEg
{
    public static void main(String[] args)
    {

    }
}

