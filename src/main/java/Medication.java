public class Medication {
    private String name;
 private Animal animal;
    private int cost;
    private String dose;

    public Medication(String name,Animal animal,int cost,String dose) {
        this.name = name;
        this.animal= animal;
        this.cost= cost;
        this.dose= dose;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }
}
