import java.util.ArrayList;

public class Airport {

    private String name;
    private ArrayList<Plane> fleet;
    private int maxPlanes;
    private ArrayList<Passenger> tourists;

    public Airport(String name, ArrayList<Plane> fleet, int maxPlanes){
    this.name =name;
    this.fleet = fleet;
    this.maxPlanes = maxPlanes;
    this.tourists = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int getNumberOfPlanesInFleet(){
        return fleet.size();
    }

    public void planeLeaveAirport(Plane plane){
        fleet.remove(plane);
    }

    public void planeArrivesAtAirport(Plane plane){
        if (fleet.size() < maxPlanes) {
        fleet.add(plane);} else {
            System.out.println("Your airport is full!");
        }
    }

}
