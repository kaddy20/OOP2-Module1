/*
    Name: Kadmiel Holness
    ID#:1700038583
 */
//* Kadmiel Holness Id#1700038583
package domain;

public class Card {
    private int cardNumber;
    private double balance;
    private int pin;
    private boolean status;

    public Card() {
        this.cardNumber = 0;
        this.balance = 0.0;
        this.pin = 0;
        this.status = false;
    }

    public Card(int cardNumber, double balance, int pin, boolean status) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.pin = pin;
        this.status = status;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void display(){
        System.out.println("card Number: " + getCardNumber()
                + "\n" + "balance: " + getBalance()
                + "\n " + "pin: " +    getPin()
                + "\n " + "status " + isStatus() );

    }
}
