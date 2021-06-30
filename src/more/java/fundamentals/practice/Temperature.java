/*
 * Write a program that an input value of Celsius and converts it to Fahrenheit.
 */

package more.java.fundamentals.practice;

// Scanner to take user input
import java.util.Scanner;

public class Temperature {
    
    public static void main(String[] args) {
        System.out.println("Give the Celsius value:");
        Scanner sc = new Scanner(System.in);
        
        // Doubles to give accurate outputs
        double celsius = sc.nextDouble();
        double fahrenheit = 9.0 / 5.0 * celsius + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}
