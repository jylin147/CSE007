/*
 * Jeffrey Lin
 * 
 * CSE 007 - 11
 * JDK - 11
 * Program that simulates RPS between a player and the computer. 
 */



package Homework.HW4;
import java.util.Scanner;

public class RPS2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String user1 = " ";                         // 0 - Rock
        String user2 = " ";                         // 1 - Paper
        int roundPlay = 0;                          // 2 - Scissors
        boolean replay = true;
        int hand1 = -1;
        int hand2 = -1;
        int win1 = 0;
        int win2 = 0;
        
        System.out.println("Please enter your name: (ex. Jeff Tony)");
        user1 = scan.next();
        // System.out.println("Please enter your name:");
        user2 = scan.next();
        
        while (replay == true) {
            System.out.println("\nWelcome to Rock Paper Scissors.");
            System.out.println("How many rounds would you like to play?");
            roundPlay = scan.nextInt();
            win1 = 0;
            win2 = 0;
            for (int i = 1; i <= roundPlay; i++) {
                    hand1 = (int)(Math.random() * 3);
                    hand2 = (int)(Math.random() * 3);
                    switch (hand1) {
                        case 0: 
                            if (hand2 == 0) {
                                System.out.println("\n" + user1 + " chose: Rock");
                                System.out.println(user2 + " chose: Rock");
                                System.out.println("Round " + i + ": Ends with a Tie.");
                            } else if (hand2 == 1) {
                                System.out.println("\n" + user1 + " chose: Rock");
                                System.out.println(user2 + " chose: Paper");
                                System.out.println("Round " + i + ": " + user2 + " wins with Paper.");
                                win2++;
                            } else if (hand2 == 2) {
                                System.out.println("\n" + user1 + " chose: Rock");
                                System.out.println(user2 + " chose: Scissors");
                                System.out.println("Round " + i + ": " + user1 + " wins with Rock.");
                                win1++;
                            }
                            break;
                        case 1: 
                            if (hand2 == 0) {
                                System.out.println("\n" + user1 + " chose: Paper");
                                System.out.println(user2 + " chose: Rock");
                                System.out.println("Round " + i + ": " + user1 + " wins with Paper.");
                                win1++;
                            } else if (hand2 == 1) {
                                System.out.println("\n" + user1 + " chose: Paper");
                                System.out.println(user2 + " chose: Paper");
                                System.out.println("Round " + i + ": Ends with a Tie.");
                            } else if (hand2 == 2) {
                                System.out.println("\n" + user1 + " chose: Paper");
                                System.out.println(user2 + " chose: Scissors");
                                System.out.println("Round " + i + ": " + user2 + " wins with Scissors.");
                                win2++;
                            }
                            break;
                        case 2:
                            if (hand2 == 0) {
                                System.out.println("\n" + user1 + " chose: Scissors");
                                System.out.println(user2 + " chose: Rock");
                                System.out.println("Round " + i + ": " + user2 + " wins with Rock.");
                                win2++;
                            } else if (hand2 == 1) {
                                System.out.println("\n" + user1 + " chose: Scissors");
                                System.out.println(user2 + " chose: Paper");
                                System.out.println("Round " + i + ": " + user1 + " wins with Scissors.");
                                win1++;
                            } else if (hand2 == 2) {
                                System.out.println("\n" + user1 + " chose: Scissors");
                                System.out.println(user2 + " chose: Scissors");
                                System.out.println("Round " + i + ": Ends with a Tie.");
                            }
                            break;
                    }
                }

                System.out.println("\n" + user1 + " won " + win1 + " rounds.");
                System.out.println(user2 + " won " + win2 + " rounds.");
                
                while (true) {
                    scan.nextLine(); // clear the scanner
                    System.out.println("\nWould you like to play again? (Yes or No)");
                    String confirm = scan.nextLine();
                    if(confirm.equalsIgnoreCase("yes")) {
                        replay = true;
                        // cont = false;
                        break;
                    } else if (confirm.equalsIgnoreCase("no")) {
                        replay = false;
                        // cont = false;
                        System.out.println("\n Have a nice day.");
                        break;
                    } else {
                        System.out.println("Please try again.");
                        // cont = true;
                        // continue;
                    }
                }
        }
        scan.close();
    }
}
