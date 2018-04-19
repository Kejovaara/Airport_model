import java.util.ArrayList;

public class Airport {

    private String name;
    private ArrayList<Plane> fleet;
    private int maxPlanes;
    private ArrayList<Passenger> tourists;

    public Airport(String name, ArrayList<Plane> fleet, int maxPlanes){
    this.name =name;
    this.fleet = fleet;
    this.maxPlanes =maxPlanes;
    this.tourists = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int getNumberOfPlanesInFleet(){
        return fleet.size();
    }

}
