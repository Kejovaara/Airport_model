package Airport.Consumables;

import Airport.Interfaces.IBuyable;

public class Beer extends Consumable implements IBuyable {

    Beer (String name, int drunkpoints, double cost, boolean ageRestricted){
        super(name, drunkpoints, cost, ageRestricted);
    }

    public double getCost() {
        return this.cost;
    }
}
