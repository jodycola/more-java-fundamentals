/*
 * Given two variables switch the variables so that first is 19 and second is 7.
 * Dont use any more numbers
 */
package more.java.fundamentals.practice;

public class Replace {
    
        public static void main(String[] args) {
            int first = 7;
            int second = 19;
            int third;
            
            third = second;
            second = first;
            first = third;
        
        System.out.println("first = " + first + " second = " +second);
        // Created an empty third variable that would hold the value of second
        // Then switched second to be first. first = 7, second = 7
        // Used the third variable to make first equal 19 or what second was initally
    }
    
}
