import java.util.ArrayList;

public class Plane {

    private Integer capacity;
    private Destination destination;
    private ArrayList<Passenger> passengerList;

    public Plane(Integer capacity, Destination destination){
        this.capacity = capacity;
        this.destination  = destination;
        this.passengerList = new ArrayList<>();
    }

    public int getPlaneCapacity(){
        return this.capacity;
    }

    public Destination getDestination() {
        return destination;
    }

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    public void addAPassenger(Passenger passenger) {
        if (passengerList.size() < capacity) {
            passengerList.add(passenger);
        }
    }

    public void RemoveAPassenger(Passenger passenger){
        passengerList.remove(passenger);
    }

    public boolean checkPassengerHasCorrectTicketForPlane(Passenger passenger){
        if (passenger.getPassengersTicketDestination() == destination){
            return true;
        } else {
            return false;
        }
    }

    //    public boolean checkPassengerTicketForPlane(Passenger passenger){
//        for (int i = 0; i < ticketsForSale.size(); i++) {
//            if (ticketsForSale.get(i).whatIsDestination() == destination){
//                return ticketsForSale.remove(i);
//            }
//        }
//        return null;
//    }

}
