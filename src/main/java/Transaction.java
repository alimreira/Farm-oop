public class Transaction {
    private Animal animalName;
    private String date;
    private int cost;

    public Transaction(Animal animalName, String date, int cost) {
        this.animalName = animalName;
        this.date = date;
        this.cost = cost;
    }

    public Animal getAnimalName() {
        return animalName;
    }

    public void setAnimalName(Animal animalName) {
        this.animalName = animalName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


}
