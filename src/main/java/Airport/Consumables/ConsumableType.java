package Airport.Consumables;

import java.util.Collection;

public enum ConsumableType {

    BEER("Beer", 2, 3.00),
    WINE("Wine", 4, 4.00),
    GIN("Gin & Tonic", 6, 4.00),
    NUTS("Nuts", -2, 1.00),
    SANDWICH("BLT sandwich", -4, 2.00),
    COFFEE("Latte", -5, 2.00);

    private String description;
    private int drunkPoints;
    private double price;

    ConsumableType(String description, int drunkPoints, double price){
        this.description = description;
        this.drunkPoints = drunkPoints;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public int getDrunkPoints() {
        return drunkPoints;
    }

    public double getPrice() {
        return price;
    }
}