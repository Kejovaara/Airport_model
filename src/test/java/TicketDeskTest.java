import Airport.Destination;
import Airport.Ticket;
import Airport.TicketDesk;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class TicketDeskTest {

    private TicketDesk ticketDesk1;

    @Before
    public void before(){
        Ticket ticket1 = new Ticket(Destination.IBIZA, 90.0);
        Ticket ticket2 = new Ticket(Destination.TENERIFE, 75.0);
        ArrayList<Ticket> tickets = new ArrayList<>();
        tickets.add(ticket1);
        tickets.add(ticket2);
        ticketDesk1 = new TicketDesk(tickets);
    }

    @Test
    public void canSellATicket(){
        ticketDesk1.sellTicket(Destination.IBIZA);
        assertEquals(1, ticketDesk1.howManyTicketsRemaining());
    }

}
