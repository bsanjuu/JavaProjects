class  Sanju
{
    void display() throws ClassNotFoundException
    {
        Class.forName("Hellooo");
    }

}
public class ThrowsExp {
    public static void main(String[] args) {

        Sanju sanju=new Sanju();
        try {
            sanju.display();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
            ex.printStackTrace();
        }
        
    }s
    
}
