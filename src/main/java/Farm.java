import java.util.ArrayList;
import java.util.List;

public class Farm {
    private String name;
    private List<Animal> animal = new ArrayList<>();
    private List<Crops> crop = new ArrayList<>();
    private List<Employee> employees= new ArrayList<>();
    private Employer Employer;
    private List<Fertiliser> fertilisers = new ArrayList<>();
    private List<Machinery> machinery = new ArrayList<>();
    private List<Medication> medication = new ArrayList<>();
    private List<Treatment> treatment = new ArrayList<>();

    public Farm(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Animal> getAnimal() {
        return animal;
    }

    public void setAnimal(List<Animal> animal) {
        this.animal = animal;
    }

    public List<Crops> getCrop() {
        return crop;
    }

    public void setCrop(List<Crops> crop) {
        this.crop = crop;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Employer getEmployer() {
        return Employer;
    }

    public void setEmployer(Employer employer) {
        Employer = employer;
    }

    public List<Fertiliser> getFertilisers() {
        return fertilisers;
    }

    public void setFertilisers(List<Fertiliser> fertilisers) {
        this.fertilisers = fertilisers;
    }

    public List<Machinery> getMachinery() {
        return machinery;
    }

    public void setMachinery(List<Machinery> machinery) {
        this.machinery = machinery;
    }

    public List<Medication> getMedication() {
        return medication;
    }

    public void setMedication(List<Medication> medication) {
        this.medication = medication;
    }

    public List<Treatment> getTreatment() {
        return treatment;
    }

    public void setTreatment(List<Treatment> treatment) {
        this.treatment = treatment;
    }
}
