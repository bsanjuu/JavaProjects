/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */


/**
 *
 * @author Nsanj
 */
import javax.swing.*;
import java.awt.*;

public class SimpleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI"); // Create a new JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the program when the user closes the window
        frame.setSize(300, 200); // Set the size of the window

        JButton button = new JButton("Click me!"); // Create a new button
        button.setPreferredSize(new Dimension(150, 50)); // Set the size of the button
        frame.add(button); // Add the button to the window

        frame.setVisible(true); // Make the window visible
    }
}