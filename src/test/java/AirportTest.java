import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class AirportTest {

    private Plane plane1;
    private Plane plane2;
    private Plane plane3;
    private Plane plane4;
    private Plane plane5;
    private Airport airport1;

    @Before
    public void before() {
        plane1 = new Plane(5, Destination.IBIZA);
        plane2 = new Plane(5, Destination.TENERIFE);
        plane3 = new Plane(5, Destination.MAGALUF);
        plane4 = new Plane(5, Destination.BENIDORM);
        plane5 = new Plane(5, Destination.BENIDORM);
        ArrayList<Plane> fleet = new ArrayList<>();
        fleet.add(plane1);
        fleet.add(plane2);
        fleet.add(plane3);
        airport1 = new Airport("JFK", fleet, 4);
    }

    @Test
    public void checkForName(){
        assertEquals("JFK", airport1.getName());
    }

    @Test
    public void checkNumberOfPlanesInFleet(){
        assertEquals(3, airport1.getNumberOfPlanesInFleet());
    }

    @Test
    public void planeCanLeaveAirport(){
        airport1.planeLeaveAirport(plane1);
        assertEquals(2, airport1.getNumberOfPlanesInFleet());
    }

    @Test
    public void planeCanArriveAtAirport(){
        airport1.planeArrivesAtAirport(plane4);
        assertEquals(4, airport1.getNumberOfPlanesInFleet());
    }

    @Test
    public void airportIsFull(){
        airport1.planeArrivesAtAirport(plane5);
        assertEquals(4, airport1.getNumberOfPlanesInFleet());
    }

}