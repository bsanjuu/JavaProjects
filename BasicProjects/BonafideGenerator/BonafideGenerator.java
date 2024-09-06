import java.util.*;

class BonafideGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.println("Enter Course Name: ");
        String courseName = sc.nextLine();

        System.out.println("Enter College Name: ");
        String collegeName = sc.nextLine();

        System.out.println("Enter Date: ");
        String date = sc.nextLine();
        String bonafideCertificate = generateBonafideCertificate(studentName, courseName, collegeName, date);

        System.out.println("\n--- Bonafide Certificate ---");
        System.out.println(bonafideCertificate);
    }

    public static String generateBonafideCertificate(String studentName, String courseName, String collegeName, String date) {
        return "This is to certify that " + studentName + " is a  student of " + collegeName + ", enrolled in the " + courseName + " course. "
                + "\nThis certificate is issued on " + date + " for the purpose of official verification.";
    }
}
