public class IfExample {
    public static void main(String[] args) {

        int temp=20;
        if(temp>30){
            System.out.println("Its a hot day");
            System.out.println("Drink Some Water");
        }
        else if(temp<20 && temp<=30){
            System.out.println("Its a beautiful  day");
        }
        else
        {
            System.out.println("Its a cold day");
        }
    }
}
