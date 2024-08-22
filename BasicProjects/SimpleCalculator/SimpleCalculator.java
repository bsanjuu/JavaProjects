import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        double num1, num2, result = 0;

        System.out.println("Simple calculator\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        num1 = sc.nextDouble();

        System.out.print("Enter number2: ");
        num2 = sc.nextDouble();

        System.out.print("Enter which operation you want to perform: +, -, *, /, %: ");
        char s = sc.next().charAt(0);

        switch (s) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator! Please enter +, -, *, /, or %.");
                return;
        }

        System.out.println("The result is: " + result);
    }
}
