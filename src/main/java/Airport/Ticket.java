package Airport;

import Airport.Destination;

public class Ticket {

    private Destination destination;

    public Ticket(Destination destination){
        this.destination = destination;
    }

    public Destination whatIsDestination(){
        return this.destination;
    }

}
