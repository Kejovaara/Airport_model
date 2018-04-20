package Airport;

public enum LuggageItem {

    SMALL(10),
    MEDIUM(15),
    LARGE(25);

    private final int weight;

    LuggageItem(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

}
