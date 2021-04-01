public class CropSold {
    private Crops cropName;
    private int bags;
    private String salesDate;

    public CropSold(Crops cropName, int bags, String salesDate) {
        this.cropName = cropName;
        this.bags = bags;
        this.salesDate = salesDate;
    }

    public Crops getCropName() {
        return cropName;
    }

    public void setCropName(Crops cropName) {
        this.cropName = cropName;
    }

    public int getBags() {
        return bags;
    }

    public void setBags(int bags) {
        this.bags = bags;
    }

    public String getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(String salesDate) {
        this.salesDate = salesDate;
    }
}
