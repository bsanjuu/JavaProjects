import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.io.image.ImageDataFactory;

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

        JTextPane resultPane = new JTextPane();
        resultPane.setBounds(50, 220, 500, 100);
        resultPane.setContentType("text/html"); // Set content type to HTML
        resultPane.setEditable(false);

        JButton downloadButton = new JButton("Download PDF");
        downloadButton.setBounds(200, 330, 200, 30);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(courseLabel);
        frame.add(courseComboBox);
        frame.add(dateLabel);
        frame.add(dateField);
        frame.add(generateButton);
        frame.add(resultPane);
        frame.add(downloadButton);

        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String studentName = nameField.getText();
                String courseName = (String) courseComboBox.getSelectedItem();
                String date = dateField.getText();

                String certificate = generateBonafideCertificate(studentName, courseName, date);
                resultPane.setText(certificate);
            }
        });

        downloadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String studentName = nameField.getText();
                String courseName = (String) courseComboBox.getSelectedItem();
                String date = dateField.getText();

                try {
                    PdfWriter writer = new PdfWriter("BonafideCertificate.pdf");
                    PdfDocument pdfDoc = new PdfDocument(writer);
                    Document doc = new Document(pdfDoc);

                    // Add a header with the university logo and name
                    Image logo = new Image(ImageDataFactory.create("university_logo.png"));
                    logo.scaleToFit(100, 100);
                    doc.add(logo);
                    doc.add(new Paragraph("American University of the Middle East").setFontSize(24).setBold());

                    // Add a section for the certificate details
                    doc.add(new Paragraph("BONAFIDE CERTIFICATE").setFontSize(18).setBold());
                    doc.add(new Paragraph("This is to certify that " + studentName + " is a student of American University of the Middle East, enrolled in the " + courseName + " course.").setFontSize(14));
                    doc.add(new Paragraph("Date: " + date).setFontSize(14));

                    // Add a section for the university seal and signature
                    Image seal = new Image(ImageDataFactory.create("university_seal.png"));
                    seal.scaleToFit(100, 100);
                    doc.add(seal);
                    doc.add(new Paragraph("Authorized Signature").setFontSize(14));

                    doc.close();
                    JOptionPane.showMessageDialog(frame, "Certificate saved as BonafideCertificate.pdf");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Error saving certificate: " + ex.getMessage());
                }
            }
        });

        frame.setVisible(true);
    }

    public static String getCurrentDate() {
        return java.time.LocalDate.now().toString();
    }

    public static String generateBonafideCertificate(String studentName, String courseName, String date) {
        return "<html><body>" +
                "<h2 style='text-align: center;'>BONAFIDE CERTIFICATE</h2>" +
                "<p>This is to certify that <b>" + studentName + "</b> is a student of <b>American University of the Middle East</b>, " +
                "enrolled in the <b>" + courseName + "</b> course.</p>" +
                "<p>Date: <b>" + date + "</b></p>" +
                "<br><br>" +
                "<p style='text-align: center;'>Authorized Signature</p>" +
                "</body></html>";
    }
}
