import Airport.Destination;
import Airport.Person.Passenger;
import Airport.Plane;
import Airport.Ticket;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlaneTest {

    Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    Ticket ticket1;

    @Before
    public void before(){
        plane = new Plane(2, Destination.TENERIFE);
        passenger1 = new Passenger(0,"Jean-Jacques");
        ticket1 = new Ticket(Destination.MAGALUF, 100.0);
        passenger1.addTicket(ticket1);
        passenger2 = new Passenger(10,"Saddam");
        passenger3 = new Passenger(5,"Gaddafi");
    }


    @Test
    public void canReceivePassenger(){
        plane.addPassenger(passenger1);
        assertEquals(1, plane.getPassengerList().size());
    }

    @Test
    public void canRemovePassenger(){
        plane.addPassenger(passenger1);
        plane.addPassenger(passenger2);
        plane.RemovePassenger(passenger1);
        assertEquals(1, plane.getPassengerList().size());
    }

    @Test
    public void getPlaneCapacity() {
        assertEquals(2 , plane.getPlaneCapacity());
    }

    @Test
    public void getDestination() {
        assertEquals(Destination.TENERIFE, plane.getDestination());
    }

    @Test
    public void getPassengerList() {
        assertEquals(0, plane.getPassengerList().size());
    }

    @Test
    public void passengerList__tooManyPassengers() {
        plane.addPassenger(passenger1);
        plane.addPassenger(passenger2);
        plane.addPassenger(passenger3);
        assertEquals(2, plane.getPassengerList().size());
    }

     @Test
     public void passengerHasTicket(){
        assertEquals(ticket1, passenger1.seePassengerTicket());
    }

    @Test
    public void checkPassengerHasCorrectTicket(){
        assertEquals(false, plane.checkPassengerHasCorrectTicketForPlane(passenger1));
    }

}
