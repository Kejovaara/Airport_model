package Airport;

import Airport.Destination;
import Airport.Ticket;

import java.util.ArrayList;

public class TicketDesk {

    private ArrayList<Ticket> ticketsForSale;

    public TicketDesk(ArrayList<Ticket> ticketsForSale)
    {
        this.ticketsForSale = ticketsForSale;
    }

    public Ticket sellATicket(Destination destination){
        for (int i = 0; i < ticketsForSale.size(); i++) {
            if (ticketsForSale.get(i).whatIsDestination() == destination){
                return ticketsForSale.remove(i);
            }
        }
        return null;
    }

    public int howManyTicketsAreLeft(){
        return this.ticketsForSale.size();
    }
}