package Airport.Person;

import Airport.Consumables.Consumable;
import Airport.Destination;
import Airport.Interfaces.IBuyable;
import Airport.Ticket;
import Airport.TicketDesk;

import java.util.ArrayList;

public class Passenger extends Person {

    private String name;
    private ArrayList<Ticket> travelWallet;
    private ArrayList<IBuyable> backpack;

    public Passenger(int drunkeness, String name) {
        super(drunkeness);
        this.name = name;
        this.travelWallet = new ArrayList<>();
        this.backpack = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int howManyTicketsInWallet(){
        return travelWallet.size();
    }

    public void addTicket(Ticket ticket){
        this.travelWallet.add(ticket);
    }

    public void buyTicket(Destination destination, TicketDesk ticketDesk){
        this.travelWallet.add(ticketDesk.sellTicket(destination));
    }

    public Ticket seePassengerTicket(){
        return travelWallet.get(0);
    }

    public Destination getTicketDestination(){
        return this.seePassengerTicket().getDestination();
    }

    public int lookInBackpack(){
        return backpack.size();
    }

    public int getBreathalysed(){
        return this.drunkeness;
    }

    public void putThingsInBackpack(Consumable consumable){
        this.backpack.add((IBuyable) consumable);
    }
}
