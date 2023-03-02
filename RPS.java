/*
 * Jeffrey Lin
 * 
 * CSE 007 - 11
 * JDK - 11
 * Simulates a rock paper scissors game
 */


package Homework.HW4;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int winner = -1;
        int win1 = 0;
        int win2 = 0;
        boolean input = true;
        boolean repeat = true;
        System.out.println("\nWelcome to Rock Paper Scissors!");
        System.out.println("What is your name?");
        String user1 = scan.nextLine();
        System.out.println("What is your name?");
        String user2 = scan.nextLine();                     
        while (repeat == true) {
            String hand1 = " ";
            String hand2 = " ";
            int result1 = (int)(Math.random() * 3);         
            int result2 = (int)(Math.random() * 3);         
            if (result1 == result2)
            switch (result1) {
                case 0:
                    hand1 = " (Rock)";
                    if (result2 == result1) {
                        winner = 0;
                        hand2 = hand1;
                    } else if (result2 == 1) {
                        winner = 2;
                        hand2 = " (Paper)";
                    } else if (result2 == 2) {
                        winner = 1;
                        hand2 = " (Scissors)";
                    }
                    break;
                case 1:
                    hand1 = " (Paper)";
                    if (result2 == 0) {
                        hand2 = " (Rock)";
                        winner = 1; 
                    } else if (result1 == result2) {
                        winner = 0;
                        hand2 = hand1;
                    } else if (result2 == 2) {
                        winner = 2;
                        hand2 = " (Scissors)";
                    }
                    break;
                case 2:
                    hand1 = " (Scissors)";
                    if (result2 == 1) {
                        winner = 1;
                        hand2 = " (Paper)";
                    } else if (result2 == 0) {
                        winner = 2;
                        hand2 = " (Rock)";
                    } else if (result2 == result1) {
                        winner = 0;
                        hand2 = hand1;
                    }
                    break;               
                default:
                    System.out.println("An error occurred.");
                    break;  
            }
            if (winner == 1) {
                System.out.println("\n" + user1 + " chose: " + result1 + hand1);
                System.out.println(user2 + " chose: " + result2 + hand2);
                System.out.println(user1 + " has won.");
                win1 += 1;
            } else if (winner == 2) {
                System.out.println("\n" + user1 + " chose: " + result1 + hand1);
                System.out.println(user2 + " chose: " + result2 + hand2);
                System.out.println(user2 + " has won.");
                win2 += 1;
            } else if (winner == 0) {
                System.out.println("\n" + user1 + " chose: " + result1 + hand1);
                System.out.println(user2 + " chose: " + result2 + hand2);
                System.out.println("There is a tie.");
            } else {
                System.out.println("An error has occurred.");
            }

            while (input == true) {
                System.out.println("\n Do you wish to play again? (Yes or No)");
                String cont = scan.nextLine();
                if(cont.equalsIgnoreCase("Yes")) {
                    break;
                } else if (cont.equalsIgnoreCase("No")) {
                    repeat = false;
                    input = false;
                    System.out.println("\n" + user1 + " won " + win1 + " times.");
                    System.out.println(user2 + " won " + win2 + " times.");
                } else {
                    System.out.println("Please try again.");
                    input = true;
                }
            }
        }
        scan.close();
    }
}
