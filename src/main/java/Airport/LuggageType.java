package Airport;

public enum LuggageType {

    SMALL(10),
    MEDIUM(15),
    LARGE(25);

    private final int weight;

    LuggageType(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

}
