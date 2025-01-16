class IfelseEg
{
    public static void main(String[] args)
    {
        int a=10;
        String result=" ";

        if(a<18)
        {
            System.out.println("You are minor");
        }
        else
        {
            System.out.println("You are adult");
        }


        //using ternary

        result=a<18 ? "Minor":"Adult";

        System.out.println(result);
    }
}