package Airport;

public enum Destination {

    TENERIFE("Tenerife"),
    IBIZA("Ibiza"),
    BENIDORM("Benidrom"),
    MAGALUF("Magaluf");

    private final String destination;

    Destination(String destination){
        this.destination = destination;
    }

    public String getDestination(){
        return destination;
    }

}
