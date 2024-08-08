import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        String input="";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Input: ");
            input = sc.nextLine().toLowerCase();
            if(!input.equals("quit"))
                System.out.println(input);
        }while(!input.equals("quit"));
    }
}
