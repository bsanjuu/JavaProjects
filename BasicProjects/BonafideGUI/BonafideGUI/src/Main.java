import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bonafide Certificate Generator");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Student Name:");
        nameLabel.setBounds(50, 30, 150, 30);
        JTextField nameField = new JTextField();
        nameField.setBounds(200, 30, 300, 30);

        JLabel courseLabel = new JLabel("Course Name:");
        courseLabel.setBounds(50, 80, 150, 30);
        String[] courses = {"Computer Science", "Cybersecurity", "Information Systems"};
        JComboBox<String> courseComboBox = new JComboBox<>(courses);
        courseComboBox.setBounds(200, 80, 300, 30);

        JLabel dateLabel = new JLabel("Date:");
        dateLabel.setBounds(50, 130, 150, 30);
        JTextField dateField = new JTextField();
        dateField.setBounds(200, 130, 300, 30);
        dateField.setText(getCurrentDate()); // Set default date to current date

        JButton generateButton = new JButton("Generate Certificate");
        generateButton.setBounds(200, 180, 200, 30);

        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(50, 220, 500, 100);
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);
        resultArea.setEditable(false);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(courseLabel);
        frame.add(courseComboBox);
        frame.add(dateLabel);
        frame.add(dateField);
        frame.add(generateButton);
        frame.add(resultArea);

        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String studentName = nameField.getText();
                String courseName = (String) courseComboBox.getSelectedItem();
                String date = dateField.getText();

                String certificate = generateBonafideCertificate(studentName, courseName, date);
                resultArea.setText(certificate);
            }
        });

        frame.setVisible(true);
    }

    public static String generateBonafideCertificate(String studentName, String courseName, String date) {
        return "This is to certify that " + studentName + " is a student of AUM, enrolled in the " + courseName + " course.\n" +
                "This certificate is issued on " + date + " for the purpose of official verification.";
    }

    private static String getCurrentDate() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return today.format(formatter);
    }
}
