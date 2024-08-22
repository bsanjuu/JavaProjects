import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculatorGUI extends JFrame implements ActionListener {
    private JTextField num1Field, num2Field, resultField;
    private JButton addButton, subButton, mulButton, divButton, modButton;

    public SimpleCalculatorGUI() {
        setTitle("Simple Calculator");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel num1Label = new JLabel("Number 1:");
        num1Label.setBounds(30, 30, 80, 30);
        add(num1Label);

        num1Field = new JTextField();
        num1Field.setBounds(120, 30, 120, 30);
        add(num1Field);

        JLabel num2Label = new JLabel("Number 2:");
        num2Label.setBounds(30, 70, 80, 30);
        add(num2Label);

        num2Field = new JTextField();
        num2Field.setBounds(120, 70, 120, 30);
        add(num2Field);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(30, 110, 80, 30);
        add(resultLabel);

        resultField = new JTextField();
        resultField.setBounds(120, 110, 120, 30);
        resultField.setEditable(false);
        add(resultField);

        addButton = new JButton("+");
        addButton.setBounds(30, 150, 50, 30);
        addButton.addActionListener(this);
        add(addButton);

        subButton = new JButton("-");
        subButton.setBounds(90, 150, 50, 30);
        subButton.addActionListener(this);
        add(subButton);

        mulButton = new JButton("*");
        mulButton.setBounds(150, 150, 50, 30);
        mulButton.addActionListener(this);
        add(mulButton);

        divButton = new JButton("/");
        divButton.setBounds(210, 150, 50, 30);
        divButton.addActionListener(this);
        add(divButton);

        modButton = new JButton("%");
        modButton.setBounds(90, 190, 100, 30);
        modButton.addActionListener(this);
        add(modButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1, num2, result = 0;

        try {
            num1 = Double.parseDouble(num1Field.getText());
            num2 = Double.parseDouble(num2Field.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (e.getSource() == addButton) {
            result = num1 + num2;
        } else if (e.getSource() == subButton) {
            result = num1 - num2;
        } else if (e.getSource() == mulButton) {
            result = num1 * num2;
        } else if (e.getSource() == divButton) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                JOptionPane.showMessageDialog(this, "Division by zero is not allowed.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else if (e.getSource() == modButton) {
            if (num2 != 0) {
                result = num1 % num2;
            } else {
                JOptionPane.showMessageDialog(this, "Division by zero is not allowed.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        resultField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new SimpleCalculatorGUI();
    }
}
