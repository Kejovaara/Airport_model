package Airport.Consumables;

import Airport.Interfaces.IBuyable;

public class Sandwich extends Consumable implements IBuyable {

    public Sandwich(String name, int drunkPoints, int cost, boolean ageRestricted){
        super(name, drunkPoints, cost, ageRestricted);
    }

    public double getCost() {
        return this.cost;
    }
}
