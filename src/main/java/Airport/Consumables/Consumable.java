package Airport.Consumables;

public abstract class Consumable {

    private String name;
    private int drunkpoints;
    protected double cost;
    private boolean ageRestricted;

    public Consumable(String name, int drunkpoints, double cost, boolean ageRestricted){
       this.name = name;
       this.drunkpoints = drunkpoints;
       this.cost = cost;
       this.ageRestricted = ageRestricted;
    }

    //TODO can be bought
    //TODO can be sold

}
