/*
 * Jeffrey Lin
 * 9 February 2023
 * CSE 007 - 11
 * JDK 11
 * Program to correctly formating US phone numbers by using modulus and division operators to isolate digits 
 */


package Labs.Lab2;
import java.util.Scanner; 

public class PhoneNumber {
    public static void main(String[] args) {
        long phoneNumber;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a 10-digit US phone number"); 
        phoneNumber = scan.nextLong();  
        long upper_range = 9999999999L;         //upper range, or maximum, of allowed US phone number (capped at 10 digits)
        if (phoneNumber <= upper_range) {      //US phone number must contain at most 10 digits
            long lineNumber = phoneNumber % 10000; 
            long preFix = (phoneNumber % 10000000) / 10000; 
            long areaCode = (phoneNumber) / 10000000; 
            System.out.println("Your Formatted Phone Number: (" + areaCode + ") " + preFix + "-" + lineNumber);  
        }  else {               //The user input value either is less than 10 digits or exceeds 10 digits
            System.out.println("You have entered an invalid US phone number");
        }
        scan.close();
    }
}
