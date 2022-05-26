/*
    Name: Kadmiel Holness
    ID#:1700038583
 */

//* Kadmiel Holness Id#1700038583//
package domain;

import java.util.Scanner;

public class myClass {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter ID number: ");
        int userID = myObj.nextInt();
        myObj.nextLine();

        System.out.println("Enter first name: ");
        String fName = myObj.nextLine();

        System.out.println("Enter last name: ");
        String lName = myObj.nextLine();

        System.out.println("Enter age: ");
        int userAge = myObj.nextInt();

        System.out.println("Enter card number: ");
        int cardNum = myObj.nextInt();

        System.out.println("Balance: ");
        double bal = myObj.nextDouble();

        System.out.println("Enter pin: ");
        int userPin = myObj.nextInt();

        System.out.println("Status: ");
        boolean stat = myObj.nextBoolean();

        Client Obj1 = new Client(userID, fName, lName);
        Card Obj = new Card(cardNum, bal, userPin, stat);
        Obj1.setAge(userAge);
        Obj1.setCard(Obj);
        Obj1.display();
        Obj1.cardDisplay();

        Obj.setStatus(true);
        Obj.setCardNumber(45678);
        Obj1.setCard(Obj);
        Obj1.cardDisplay();
    }
}
