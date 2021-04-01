public class Animal {
    private String name;
   // private Medication medication;
    private int quantity;


    public Animal(String name,int quantity) {
        this.name = name;
        this.quantity = quantity;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
