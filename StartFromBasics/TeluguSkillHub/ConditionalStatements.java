
import java.util.Scanner;


public class ConditionalStatements {
    public static void main(String[] args) {
        
        // int a = 10;
        // int b = 20;
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
        
        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is equal to b");
        }
    }

}
