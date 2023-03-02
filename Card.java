/*
 * Jeffrey Lin
 * 2/16/2023
 * CSE 007 - 11
 * JDK - 11
 * Program generates a random card from a deck of 52 without using imported methods
 */


package Labs.Lab3;


public class Card {
    public static void main(String[] args){
        int cardNumber = (int)(Math.random() * 51);     //assigns cardNumber with a number between 0 and 51 (corresponding to the cards, 1 - 52)
        String suitName = "";
        String cardIdentity = "";
        int suitInt = cardNumber / 13;
        int identityInt = cardNumber % 13;
        if(suitInt == 0) {
            suitName = "Diamonds";
        } else if(suitInt == 1) {
            suitName = "Clubs";
        } else if(suitInt == 2) {
            suitName = "Hearts";
        } else if(suitInt == 3){
            suitName = "Spades";
        } else {
            System.out.println("An error has occurred.");
        }

        switch(identityInt) {           //determines the card values
            case 0:                     //if identityInt is = 0, its card value is assigned to string "Ace"
                cardIdentity = "Ace";
                System.out.println("\nRandom Number = " + cardNumber);
                System.out.println(cardNumber + " / 13 = " + suitInt + "\tSuit is " + suitName);
                System.out.println(cardNumber + " % 13 = " + identityInt + "\tIdentity is " + cardIdentity);
                System.out.println("\n" + cardIdentity + " of " + suitName + "\n");
                break;
            case 1: 
                cardIdentity = "2";
                System.out.println("\nRandom Number = " + cardNumber);
                System.out.println(cardNumber + " / 13 = " + suitInt + "\tSuit is " + suitName);
                System.out.println(cardNumber + " % 13 = " + identityInt + "\tIdentity is " + cardIdentity);
                System.out.println("\n" + cardIdentity + " of " + suitName + "\n");
                break;
            case 2:
                cardIdentity = "3";
                System.out.println("\nRandom Number = " + cardNumber);
                System.out.println(cardNumber + " / 13 = " + suitInt + "\tSuit is " + suitName);
                System.out.println(cardNumber + " % 13 = " + identityInt + "\tIdentity is " + cardIdentity);
                System.out.println("\n" + cardIdentity + " of " + suitName + "\n");
                break;
            case 3:
                cardIdentity = "4";
                System.out.println("\nRandom Number = " + cardNumber);
                System.out.println(cardNumber + " / 13 = " + suitInt + "\tSuit is " + suitName);
                System.out.println(cardNumber + " % 13 = " + identityInt + "\tIdentity is " + cardIdentity);
                System.out.println("\n" + cardIdentity + " of " + suitName + "\n");
                break;
            case 4:
                cardIdentity = "5";
                System.out.println("\nRandom Number = " + cardNumber);
                System.out.println(cardNumber + " / 13 = " + suitInt + "\tSuit is " + suitName);
                System.out.println(cardNumber + " % 13 = " + identityInt + "\tIdentity is " + cardIdentity);
                System.out.println("\n" + cardIdentity + " of " + suitName + "\n");
                break;
            case 5:
                cardIdentity = "6";
                System.out.println("\nRandom Number = " + cardNumber);
                System.out.println(cardNumber + " / 13 = " + suitInt + "\tSuit is " + suitName);
                System.out.println(cardNumber + " % 13 = " + identityInt + "\tIdentity is " + cardIdentity);
                System.out.println("\n" + cardIdentity + " of " + suitName + "\n");
                break;
            case 6:
                cardIdentity = "7";
                System.out.println("\nRandom Number = " + cardNumber);
                System.out.println(cardNumber + " / 13 = " + suitInt + "\tSuit is " + suitName);
                System.out.println(cardNumber + " % 13 = " + identityInt + "\tIdentity is " + cardIdentity);
                System.out.println("\n" + cardIdentity + " of " + suitName + "\n");
                break;
            case 7:
                cardIdentity = "8";
                System.out.println("\nRandom Number = " + cardNumber);
                System.out.println(cardNumber + " / 13 = " + suitInt + "\tSuit is " + suitName);
                System.out.println(cardNumber + " % 13 = " + identityInt + "\tIdentity is " + cardIdentity);
                System.out.println("\n" + cardIdentity + " of " + suitName + "\n");
                break;
            case 8:
                cardIdentity = "9";
                System.out.println("\nRandom Number = " + cardNumber);
                System.out.println(cardNumber + " / 13 = " + suitInt + "\tSuit is " + suitName);
                System.out.println(cardNumber + " % 13 = " + identityInt + "\tIdentity is " + cardIdentity);
                System.out.println("\n" + cardIdentity + " of " + suitName + "\n");
                break;
            case 9:
                cardIdentity = "10";
                System.out.println("\nRandom Number = " + cardNumber);
                System.out.println(cardNumber + " / 13 = " + suitInt + "\tSuit is " + suitName);
                System.out.println(cardNumber + " % 13 = " + identityInt + "\tIdentity is " + cardIdentity);
                System.out.println("\n" + cardIdentity + " of " + suitName + "\n");
                break;
            case 10:
                cardIdentity = "Jack";
                System.out.println("\nRandom Number = " + cardNumber);
                System.out.println(cardNumber + " / 13 = " + suitInt + "\tSuit is " + suitName);
                System.out.println(cardNumber + " % 13 = " + identityInt + "\tIdentity is " + cardIdentity);
                System.out.println("\n" + cardIdentity + " of " + suitName + "\n");
                break;
            case 11:
                cardIdentity = "Queen";
                System.out.println("\nRandom Number = " + cardNumber);
                System.out.println(cardNumber + " / 13 = " + suitInt + "\tSuit is " + suitName);
                System.out.println(cardNumber + " % 13 = " + identityInt + "\tIdentity is " + cardIdentity);
                System.out.println("\n" + cardIdentity + " of " + suitName + "\n");
                break;
            case 12:
                cardIdentity = "King";
                System.out.println("\nRandom Number = " + cardNumber);
                System.out.println(cardNumber + " / 13 = " + suitInt + "\tSuit is " + suitName);
                System.out.println(cardNumber + " % 13 = " + identityInt + "\tIdentity is " + cardIdentity);
                System.out.println("\n" + cardIdentity + " of " + suitName + "\n");
                break;
            default:
                System.out.println("An error has occured.");
            }
    }  
}
