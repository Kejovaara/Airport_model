import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class PlaneTest {

    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Ticket ticket1;

    @Before
    public void before(){
        plane = new Plane(2, Destination.TENERIFE);
        passenger1 = new Passenger("Jean-Jacques");
        ticket1 = new Ticket(Destination.MAGALUF);
        passenger1.addATicket(ticket1);
        passenger2 = new Passenger("Saddam");
        passenger3 = new Passenger("Gaddafi");
    }


    @Test
    public void canReceivePassenger(){
        plane.addAPassenger(passenger1);
        assertEquals(1, plane.getPassengerList().size());
    }

    @Test
    public void canRemovePassenger(){
        plane.addAPassenger(passenger1);
        plane.addAPassenger(passenger2);
        plane.RemoveAPassenger(passenger1);
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
        plane.addAPassenger(passenger1);
        plane.addAPassenger(passenger2);
        plane.addAPassenger(passenger3);
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
