package Airport;

import Airport.Destination;

public class Ticket {

    private double cost;
    private Destination destination;

    public Ticket(Destination destination, double cost){
        this.destination = destination;
        this.cost = cost;
    }

    public Destination whatIsDestination(){
        return this.destination;
    }

}
