import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
//        int i=5;
//
//        while(i>0)
//        {
//            System.out.println("While loop "+i);
//            i--;
//        }

        String input="";
        Scanner sc = new Scanner(System.in);
        while(!input.equals("quit"))
        {
            System.out.print("Input: ");
            input = sc.nextLine().toLowerCase();
            if(!input.equals("quit"))
             System.out.println(input);
        }

    }

}
