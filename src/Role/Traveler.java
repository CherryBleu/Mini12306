package Role;

import Data.Ticket;

import java.util.ArrayList;

public class Traveler extends Person{
    private String phoneNumber;
    private String cardNumber;
    private ArrayList<Ticket> ticketArrayList;

    public Traveler(String ID, String password, String phoneNumber, String cardNumber) {
        super(ID, password);
        this.phoneNumber = phoneNumber;
        this.cardNumber = cardNumber;
        ticketArrayList = new ArrayList<>();
        setRole("Traveler");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public ArrayList<Ticket> getTicketArrayList() {
        return ticketArrayList;
    }

    public void setTicketArrayList(ArrayList<Ticket> ticketArrayList) {
        this.ticketArrayList = ticketArrayList;
    }
}
