public class Loops {
    
    public static void main(String[] args) {
        // For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For Loop: " + i);
        }
        // While Loop
        int j = 0;
        while (j < 5) {
            System.out.println("While Loop: " + j);
            j++;
        }

        // Do-While Loop
        int k = 0;
        do 
        {
            System.out.println("Do-While Loop: " + k);
            k++;
            
        } while (k < 5);

        // For-Each Loop
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("For-Each Loop: " + number);
        }
        // Nested Loop
        for (int i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Nested Loop: i=" + i + ", j=" + j);
            }
        }
            

    }

}