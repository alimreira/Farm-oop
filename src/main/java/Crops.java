public class Crops {
    private String name;
    private String type;
    private Fertiliser fertiliser;
    private int bags;

    public Crops(String name, String type,Fertiliser fertiliser, int bags) {
        this.name = name;
        this.type = type;
        this.fertiliser=fertiliser;
        this.bags= bags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Fertiliser getFertiliser() {
        return fertiliser;
    }

    public void setFertiliser(Fertiliser fertiliser) {
        this.fertiliser = fertiliser;
    }

    public int getBags() {
        return bags;
    }

    public void setBags(int bags) {
        this.bags = bags;
    }
}
