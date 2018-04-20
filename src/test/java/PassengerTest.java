import Airport.Destination;
import Airport.Person.Passenger;
import Airport.Ticket;
import Airport.TicketDesk;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class PassengerTest {

    private Passenger passenger1;
    private Passenger passenger2;
    private Ticket ticket1;
    private Ticket ticket2;
    private TicketDesk ticketDesk;

    @Before
    public void before() {
        passenger1 = new Passenger("Simon");
        passenger2 = new Passenger("Aileen");
        ArrayList<Ticket> tickets = new ArrayList<>();
        ticket1 = new Ticket(Destination.MAGALUF);
        ticket2 = new Ticket(Destination.IBIZA);
        tickets.add(ticket1);
        tickets.add(ticket2);
        ticketDesk = new TicketDesk(tickets);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Simon", passenger1.whatIsName());
    }

    @Test
    public void travelWalletIsEmpty(){
        assertEquals(0, passenger2.howManyTicketsInWallet());
    }

    @Test
    public void canAddTicketToWallet(){
        passenger1.addATicket(ticket1);
        assertEquals(1, passenger1.howManyTicketsInWallet());
    }

    @Test
    public void canBuyTicket(){
        passenger1.buyTicket(Destination.MAGALUF, ticketDesk);
        assertEquals(1, passenger1.howManyTicketsInWallet());
        assertEquals(1, ticketDesk.howManyTicketsAreLeft());
    }

    @Test
    public void getPassengersTicketDestination(){
        passenger1.buyTicket(Destination.IBIZA, ticketDesk);
        assertEquals("Ibiza", passenger1.getPassengersTicketDestination().getDestination());
    }

}
