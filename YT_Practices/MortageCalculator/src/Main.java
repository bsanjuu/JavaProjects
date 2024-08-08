import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Monthly EMI Calculator\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualInterest = scanner.nextDouble();
        double monthlyInterest = annualInterest / 100 / 12;
        System.out.print("Period (Years): ");
        int years = scanner.nextInt();
        int numberOfPayments = years * 12;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

        scanner.close();
    }
}

/*output
Monthly EMI Calculator

Principal: 100000
Annual Interest Rate: 3.92
Period (Years): 30
Mortgage: $472.81

Process finished with exit code 0

 */