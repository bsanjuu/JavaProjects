
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        int marks;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the marks");
        marks = sc.nextInt();
        switch (marks/10){
            case 10:
            case 9:
                System.out.println("A+");
                break;
            case 8:
                System.out.println("A");
                break;
            case 7:
                System.out.println("B+");
                break;
            case 6:
                System.out.println("B");
                break;
            case 5:
                System.out.println("C");
                break;
            default:
                System.out.println("Fail");
        }
        
    }

}
