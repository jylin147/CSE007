/*
 * Jeffrey Lin
 * 2/28/23
 * CSE 007 - 11
 * JDK - 11
 * Program that generate a random 3-digit number between (110,1000), printing that number and outputting a countdown that stops when the three digits of the number are identical.
 */


package Midterm1;

import java.util.Scanner;

public class exam1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        double total = 0;
        
        while (true) {
            System.out.println("\nPlease enter a number between 2 and 48, inclusive.");
            int numTimes = scan.nextInt();
            if (numTimes >= 2 && numTimes <= 48) {
                for (int i = 0; i < numTimes; i++) {
                    count = 0;
                    int randNum = (int)(Math.random() * 889) + 110;
                    System.out.println("\nRandom number is: " + randNum);
                    boolean confirm = false;
                    while (confirm == false) {
                        int index0 = (randNum % 1000) / 100;
                        int index1 = (randNum % 100) / 10;
                        int index2 = (randNum % 10);
                        if (index1 == index2 && index0 == index1) {
                            System.out.print(" " + randNum);
                            System.out.println("\n" + count + " numbers printed until matching digits.");
                            confirm = true;
                            break;
                        }
                        System.out.print(" " + randNum);
                        randNum -= 1;
                        count += 1; 
                        total += 1;
                    }
                }
                double avg = total / numTimes; 
                System.out.println("\nAverage number printed across " + numTimes + " rounds: " + avg);
                System.out.println("\nTotal printed across " + numTimes + " rounds: " + total);
                System.out.println("\n ");
                scan.close();
                break;
            } else {
                System.out.println("Please try again.");
            }
        }
    }
}
