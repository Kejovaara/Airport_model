package Airport.Person;

import Airport.Luggage;

import java.util.ArrayList;

public class BaggageHandler extends StaffMember {

    private ArrayList<Luggage> baggageCart;

    public BaggageHandler(int drunkeness, ArrayList<Luggage> baggageCart){
        super(drunkeness);
        this.baggageCart = baggageCart;
    }

    //TODO canTakeLuggage
    //TODO canPutLuggageOnPlane

}
