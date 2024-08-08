import java.text.NumberFormat;

public class MathFunctions {
public static void main(String[] args) {

    int result=Math.max(1,2);
    System.out.println(result);
    double randomNumber=Math.round(Math.random()*100);
    System.out.println(randomNumber);

    //Number Format

    NumberFormat currency=NumberFormat.getCurrencyInstance();
    String resultCurrency=currency.format(2345432.7889);
    System.out.println(resultCurrency);
}
}
