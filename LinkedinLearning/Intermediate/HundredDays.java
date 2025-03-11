import java.time.LocalDate;
import java.time.Period;

public class HundredDays {

    public static LocalDate calculateHundredDaysFromNow(LocalDate today) {
        Period hundredDays = Period.ofDays(100);
        return today.plus(hundredDays);
    }

    public static void main(String[] args) {
        
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);
        LocalDate hundredDaysFromNow = calculateHundredDaysFromNow(today);
        System.out.println("100 days from now: " + hundredDaysFromNow);
        
    }
    
}
