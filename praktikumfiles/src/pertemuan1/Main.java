package pertemuan1;

import pertemuan1.model.Mouse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    // Need IOException for BufferedReader
    // Remove IOException for Scanner
    public static void main(String[] args) throws IOException {

        /*
         // Making object of Mouse by using primary constructor
        Mouse logitech = new Mouse("Logitech", 146, 6, "White");

        // Making object of Mouse by using primary constructor
        Mouse apple = new Mouse();

        // Set value to object of Mouse using setter methods
        apple.setBrand("Apple");
        apple.setWeight(100);
        apple.setColor("White");
        apple.setTotalButton(1);

        // Print object of Mouse using getter methods
        System.out.println("Brand: " + logitech.getBrand());
        System.out.println("Weight: " + logitech.getWeight());
        System.out.println("Color: " + logitech.getColor());
        System.out.println("Total Button: " + logitech.getTotalButton());
         */

        /*
        // Making Scanner object
        Scanner keyboard = new Scanner(System.in);

        // Entering value to name with Scanner object -> keyboard
        System.out.print("Enter name: ");
        String name = keyboard.nextLine();

        // Entering value to studentID with Scanner object -> keyboard
        System.out.print("Enter student's ID: ");
        String studentID = keyboard.nextLine();

        // Entering value to studentGPA with Scanner object -> keyboard
        System.out.print("Enter student's GPA: ");
        float studentGPA = keyboard.nextFloat();

        // Or entering value to studentGPA with Scanner object -> keyboard and convert to float
        // float studentGPA = Float.parseFloat(keyboard.nextLine());

        // print out the value of name, studentID, and studentGPA
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student GPA: " + studentGPA);

         */

        // Making input with BufferedReader and InputStreamReader
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        // Entering value to name with BufferedReader object -> keyboard
        System.out.print("Enter name: ");
        String name = keyboard.readLine();

        // Entering value to studentID with BufferedReader object -> keyboard
        System.out.print("Enter student's ID: ");
        String studentID = keyboard.readLine();

        // Or entering value to studentGPA with BufferedReader object -> keyboard and convert to float
        System.out.print("Enter student's GPA: ");
        float studentGPA = Float.parseFloat(keyboard.readLine());

        // print out the value of name, studentID, and studentGPA
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student GPA: " + studentGPA);

    }
}
