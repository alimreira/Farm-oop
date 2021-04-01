public class AnimalPurchased extends Transaction {
        private int quantity;
    public AnimalPurchased(Animal animalName, String date, int cost, int quantity) {
        super(animalName, date, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
