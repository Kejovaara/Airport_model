package Airport;

import java.util.ArrayList;

public class TicketDesk {

    private ArrayList<Ticket> ticketsForSale;

    public TicketDesk(ArrayList<Ticket> ticketsForSale)
    {
        this.ticketsForSale = ticketsForSale;
    }

    public Ticket sellTicket(Destination destination){
        for (int i = 0; i < ticketsForSale.size(); i++) {
            if (ticketsForSale.get(i).getDestination() == destination){
                return ticketsForSale.remove(i);
            }
        }
        return null;
    }

    public int howManyTicketsRemaining(){
        return this.ticketsForSale.size();
    }
}