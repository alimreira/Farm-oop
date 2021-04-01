public class Fertiliser {
    private int cost;
    private String name;
    private Crops crops;


    public Fertiliser(int cost, String name) {
        this.cost = cost;
        this.name = name;

    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Crops getCrops() {
        return crops;
    }

    public void setCrops(Crops crops) {
        this.crops = crops;
    }
}
