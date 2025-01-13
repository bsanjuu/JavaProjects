import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWRes {

    public static void main(String[] args) throws IOException{
        int a = 0;
        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a number");
            a = Integer.parseInt(br.readLine());
            int b = a / 0;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
                    
                    br.close();
                    System.out.println("in finally block");
            }
        }
    
}

