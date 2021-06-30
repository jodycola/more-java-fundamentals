/*
 * Create a conditional that takes an input in fahrenheit and prints out if the
 * temperature is boilng, freezing or neither.
 */
package more.java.fundamentals.practice;

import java.util.Scanner;

public class Boiling {
    
    public static void main(String[] args) {
    System.out.println("Give the temperature:");
    Scanner sc = new Scanner(System.in);
    int temp = sc.nextInt();
    
    if (temp > 212) {
     System.out.println("The water is boiling");
     return;
    } else if (temp < 32) {
    System.out.println("The water is freezing");
    } else
        System.out.println("The water isn't boiling or freezing");
    
    }
}
