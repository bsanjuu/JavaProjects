import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Monthly EMI Calculator\n");
        Scanner scanner = new Scanner(System.in);

        int principal;
        while (true) {
            System.out.print("Principal ($1K – $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1,000 and 1,000,000.");
        }

        double annualInterest;
        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextDouble();
            if (annualInterest > 0 && annualInterest <= 30)
                break;
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }
        double monthlyInterest = annualInterest / 100 / 12;

        int years;
        while (true) {
            System.out.print("Period (Years): ");
            years = scanner.nextInt();
            if (years >= 1 && years <= 30)
                break;
            System.out.println("Enter a value between 1 and 30.");
        }
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

/Users/bug/Library/Java/JavaVirtualMachines/openjdk-22.0.1/Contents/Home/bin/java -javaagent:/Users/bug/Applications/IntelliJ IDEA Ultimate.app/Contents/lib/idea_rt.jar=51150:/Users/bug/Applications/IntelliJ IDEA Ultimate.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/bug/JavaProjects/YT_Practices/MortageCalculator/out/production/MortageCalculator Main
Monthly EMI Calculator

Principal ($1K – $1M): 1
Enter a value between 1,000 and 1,000,000.
Principal ($1K – $1M): 2
Enter a value between 1,000 and 1,000,000.
Principal ($1K – $1M): 1000000
Annual Interest Rate: 0
Enter a value greater than 0 and less than or equal to 30.
Annual Interest Rate: 3.92
Period (Years): 0
Enter a value between 1 and 30.
Period (Years): 30
Mortgage: $4,728.15

Process finished with exit code 0


 */