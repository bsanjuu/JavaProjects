import  java.util.Scanner;
public class PasswordComplexity {
    
    public static boolean isPasswordComplex(String password)
    {

        return password.length()>=6 && password.matches(".*[A-Z].*") 
                                    && password.matches(".*[a-z].*") 
                                    && password.matches(".*\\d.*");


        // if(password.length() < 6)
        // {
        //     return false;
        // }
        // boolean hasUppercase = false;
        // boolean hasLowercase = false;
        // boolean hasDigit = false;

        // for(int i=0;i<password.length()||!hasLowercase||!hasUppercase||!hasDigit;i++)
        // {
        //     char ch = password.charAt(i);
        //     if(Character.isDigit(ch))
        //     {
        //         hasDigit = true;
        //     }
        //     else if(Character.isLowerCase(ch))
        //     {
        //         hasLowercase = true;
        //     }
        //     else if(Character.isUpperCase(ch))
        //     {
        //         hasUppercase = true;
        //     }
        // }
        // return hasUppercase && hasLowercase && hasDigit;
        
    }
    
        
    public static void main(String[] args) {

        String password;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password: ");
        password = scanner.nextLine();
        if (isPasswordComplex(password)) {
            System.out.println("Password is complex");
        } else {
            System.out.println("Password is not complex");
        }

    
    }
}
