
/*
    Name: Kadmiel Holness
    ID#:1700038583
 */

package domain;

public class Client {
    private int idNumber;
    private String firstName;
    private String lastName;
    private int age;
    private Card card;

    public Client() {
        this.idNumber = 0;
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
    }

    public Client(int idNumber, String firstName, String lastName) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void display() {
        System.out.println("----Client details----" + "\n"
                + "id Number: " + getIdNumber()
                + "\n" + "firstName: " + getFirstName()
                + "\n" + "lastName: " + getLastName()
                + "\n" + "age " + getAge());
    }

    public void cardDisplay() {
        System.out.println("---Card details---" + "\n"
                + "Card Number: " + getCard().getCardNumber() + "\n"
                + "Balance: " + getCard().getBalance() + "\n"
                + "Pin: " + getCard().getPin() + "\n"
                + "Status: " + getCard().isStatus());


    }
}
