package Airport.Person;

import Airport.Destination;
import Airport.Ticket;
import Airport.TicketDesk;

import java.util.ArrayList;

public class Passenger extends Person{

    private String name;
    private ArrayList<Ticket> travelWallet;
    private int drunkeness;

    public Passenger(int drunkeness, String name) {
        super(drunkeness);
        this.name = name;
        this.travelWallet = new ArrayList<>();
    }

    public String whatIsName(){
        return this.name;
    }

    public int howManyTicketsInWallet(){
        return travelWallet.size();
    }

    public void addATicket(Ticket ticket){
        this.travelWallet.add(ticket);
    }

    public void buyTicket(Destination destination, TicketDesk ticketDesk){
        this.travelWallet.add(ticketDesk.sellATicket(destination));
    }

    public Ticket seePassengerTicket(){
        return travelWallet.get(0);
    }

    public Destination getPassengersTicketDestination(){
        return this.seePassengerTicket().whatIsDestination();
    }
}
