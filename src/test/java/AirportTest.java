import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class AirportTest {

    private Plane plane1;
    private Plane plane2;
    private Plane plane3;
    private Airport airport1;

    @Before
    public void before() {
        plane1 = new Plane(5, Destination.IBIZA);
        plane2 = new Plane(5, Destination.TENERIFE);
        plane3 = new Plane(5, Destination.MAGALUF);
        ArrayList<Plane> fleet = new ArrayList<>();
        fleet.add(plane1);
        fleet.add(plane2);
        fleet.add(plane3);
        airport1 = new Airport("JFK", fleet, 5);
    }

    @Test
    public void checkForName(){
        assertEquals("JFK", airport1.getName());
    }

    @Test
    public void checkNumberOfPlanesInFleet(){
        assertEquals(3, airport1.getNumberOfPlanesInFleet());
    }

}