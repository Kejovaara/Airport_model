package Airport;

import Airport.Person.Passenger;

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

    public void addPassenger(Passenger passenger) {
        if (passengerList.size() < capacity) {
            passengerList.add(passenger);
        }
    }

    public void RemovePassenger(Passenger passenger){
        passengerList.remove(passenger);
    }

    public boolean checkPassengerHasCorrectTicketForPlane(Passenger passenger){
        if (passenger.getTicketDestination() == destination){
            return true;
        } else {
            return false;
        }
    }
}
