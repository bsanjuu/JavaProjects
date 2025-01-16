class  Sanju extends  Exception
{
    public  Sanju(String message)
    {
        super(message);
    }
}


public class ExceptonThrow {

    public static void main(String[] args) {

        int a=21;
        int b=0;
        try {
            b = 20 / a;
            if(b==0)
            {
                // throw new ArithmeticException("b can't be zero");

                throw new Sanju("b can't be zero");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic  Occured "+e);
        }
        // catch(Exception e)
        // {
        //     System.out.println("Exception Occured :" +e);
        // }
        catch(Sanju e)
        {
            System.out.println("Sanju Occured " +e);
        }

        System.out.println("b is :"+b);
        System.out.println("Bye!!");
        
    }
}
