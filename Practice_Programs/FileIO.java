/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nsanj
 */
import java.io.*;

public class FileIO {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String line;

        // Writing to a file
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Hello, World!");
            bufferedWriter.newLine();
            bufferedWriter.write("This is a sample text file.");
            bufferedWriter.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file '" + fileName + "'");
        }

        // Reading from a file
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File '" + fileName + "' not found.");
        } catch (IOException e) {
            System.out.println("Error reading file '" + fileName + "'");
        }
    }
}