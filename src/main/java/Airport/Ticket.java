package Airport;

import Airport.Destination;
import Airport.Interfaces.IBuyable;

public class Ticket implements IBuyable {

    private double cost;
    private Destination destination;

    public Ticket(Destination destination, double cost){
        this.destination = destination;
        this.cost = cost;
    }

    public Destination getDestination(){
        return this.destination;
    }

    public double getCost(){
        return this.cost;
    }

}
