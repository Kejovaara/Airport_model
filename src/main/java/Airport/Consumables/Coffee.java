package Airport.Consumables;

import Airport.Interfaces.IBuyable;

public class Coffee extends Consumable implements IBuyable {

    public Coffee(String name, int drunkPoints, int cost, boolean ageRestricted){
        super(name, drunkPoints, cost, ageRestricted);
    }

    public double getCost() {
        return this.cost;
    }
}
