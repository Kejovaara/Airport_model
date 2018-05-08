import Airport.Consumables.Coffee;
import Airport.Consumables.Sandwich;
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
    private Coffee coffee1;
    private Sandwich sandwich1;


    @Before
    public void before() {
        coffee1 = new Coffee("Americano", -5, 2, false);
        sandwich1 = new Sandwich("BLT", -4, 2, false);
        passenger1 = new Passenger(10,"Simon");
        passenger2 = new Passenger(8,"Aileen");
        ArrayList<Ticket> tickets = new ArrayList<>();
        ticket1 = new Ticket(Destination.MAGALUF, 80.0);
        ticket2 = new Ticket(Destination.IBIZA, 75.0);
        tickets.add(ticket1);
        tickets.add(ticket2);
        ticketDesk = new TicketDesk(tickets);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Simon", passenger1.getName());
    }

    @Test
    public void travelWalletIsEmpty(){
        assertEquals(0, passenger2.howManyTicketsInWallet());
    }

    @Test
    public void canAddTicketToWallet(){
        passenger1.addTicket(ticket1);
        assertEquals(1, passenger1.howManyTicketsInWallet());
    }

    @Test
    public void canBuyTicket(){
        passenger1.buyTicket(Destination.MAGALUF, ticketDesk);
        assertEquals(1, passenger1.howManyTicketsInWallet());
        assertEquals(1, ticketDesk.howManyTicketsRemaining());
    }

    @Test
    public void getPassengersTicketDestination(){
        passenger1.buyTicket(Destination.IBIZA, ticketDesk);
        assertEquals("Ibiza", passenger1.getTicketDestination().getDestination());
    }

    @Test
    public void backpackStartsEmpty(){
        assertEquals(0, passenger1.lookInBackpack());
    }

    @Test public void backPackCanTakeIBuyables(){
        passenger1.putThingsInBackpack(coffee1);
        passenger1.putThingsInBackpack(sandwich1);
        assertEquals(2, passenger1.lookInBackpack());
    }

    @Test
    public void checkPassengerDrunkeness(){
        assertEquals(10, passenger1.getBreathalysed());
    }

}
