class VariableDeclaration
{
    int a=20;
    float b=10.0f;
    double c=10.0;
    char d='a';
    boolean e=true;
    String f="Hello";



    public static void main(String[] args) {
        VariableDeclaration v = new VariableDeclaration();
        System.out.println("int "+v.a+" ");
        System.out.println("float "+v.b);
        System.out.println("double "+v.c);
        System.out.println("char "+v.d);
        System.out.println("boolean "+v.e);
        System.out.println("String "+v.f);
        
    }

}