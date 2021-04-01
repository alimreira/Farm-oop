import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Farm farm = new Farm("Amazing-Farms");

        Employee employee = new Employee("Shina", "veterinarian", "early");
        Employee employee1 = new Employee("Jude", "farmer", "early");
        Employee employee2 = new Employee("Peter", "cleaner", "early");
        Employee employee3 = new Employee("John", "harvester", "late");
        Employee employee4 = new Employee("Wole", "bus-driver", "early");
        Employee employee5 = new Employee("Dele", "tractor-driver", "late");
        Employee employee6 = new Employee("Monday", "P.A", "early");
        Employee employee7 = new Employee("Grace", "marketer", "late");


        Employer employer = new Employer("Oga");


        Machinery machinery = new Machinery("Tractor", "pushing");
        Machinery machinery1 = new Machinery("Plough", "plowing");
        Machinery machinery2 = new Machinery("Sprayer", "herbicides");
        Machinery machinery3 = new Machinery("Irrigation", "watering");


//        Animal animal = new Animal("cat-fish",medication );
//        Animal animal1 = new Animal("goat", medication1);
//        Animal animal2 = new Animal("cow",medication2);
//        Animal animal3 = new Animal("pig",medication3);
//
        Animal animal = new Animal("cat-fish", 100);
        Animal animal1 = new Animal("goat", 200);
        Animal animal2 = new Animal("cow", 150);
        Animal animal3 = new Animal("pig", 120);


        Medication medication = new Medication("lepirudin", animal1, 3400, "20mm");
        Medication medication1 = new Medication("amitraz", animal, 5500, "60kg");
        Medication medication2 = new Medication("amantadine", animal2, 6700, "80mm");
        Medication medication3 = new Medication("alprazolam", animal3, 7000, "85kg");


        Treatment treatment = new Treatment("kaolin");
        Treatment treatment1 = new Treatment("eletrolytes");
        Treatment treatment2 = new Treatment("antibiotic");
        Treatment treatment3 = new Treatment("injection");


        Fertiliser fertiliser = new Fertiliser(2000, "Nitrogen");
        Fertiliser fertiliser1 = new Fertiliser(4500, "Phosphorus");
        Fertiliser fertiliser2 = new Fertiliser(3500, "Potassium");
        Fertiliser fertiliser3 = new Fertiliser(1500, "Phosphate");
        Fertiliser fertiliser4 = new Fertiliser(6500, "Potash");

        Crops crops = new Crops("Beans", "legume", fertiliser, 250);
        Crops crops1 = new Crops("Rice", "cereal", fertiliser1, 250);
        Crops crops2 = new Crops("Millet", "cereal", fertiliser2, 250);
        Crops crops3 = new Crops("Maize", "cereal", fertiliser3, 250);
        Crops crops4 = new Crops("Peanuts", "legume", fertiliser4, 250);

        farm.setEmployer(employer);

        AnimalPurchased animalPurchased = new AnimalPurchased(animal, "21-04-2019", 3500, 50);
        AnimalPurchased animalPurchased1 = new AnimalPurchased(animal1, "12-05-2019", 4800, 50);
        AnimalPurchased animalPurchased2 = new AnimalPurchased(animal3, "10-06-2019", 5000, 50);
        List<AnimalPurchased> animalPurchasedList = new ArrayList<>();

        animalPurchasedList.add(animalPurchased);
        animalPurchasedList.add(animalPurchased1);
        animalPurchasedList.add(animalPurchased2);


        AnimalSold animalSold = new AnimalSold(animal1, "19-03-2019", 4500, 75);
        AnimalSold animalSold1 = new AnimalSold(animal2, "15-04-2019", 4500, 75);
        AnimalSold animalSold2 = new AnimalSold(animal, "25-04-2019", 4500, 75);
        AnimalSold animalSold3 = new AnimalSold(animal3, "11-06-2019", 4500, 75);
        List<AnimalSold> animalSoldList = new ArrayList<>();


        CropSold cropSold = new CropSold(crops, 50, "30-05-2019");
        CropSold cropSold1 = new CropSold(crops, 80, "30-05-2019");
        CropSold cropSold2 = new CropSold(crops, 100, "30-05-2019");
        CropSold cropSold3 = new CropSold(crops, 75, "30-05-2019");


        Transaction transaction = new Transaction(animal3, "15-06-2019", 6500);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(animal);
        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);

        farm.setAnimal(animalList);

        List<Crops> cropsList = new ArrayList<>();
        cropsList.add(crops);
        cropsList.add(crops1);
        cropsList.add(crops2);
        cropsList.add(crops3);
        cropsList.add(crops4);
        farm.setCrop(cropsList);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);
        farm.setEmployees(employeeList);

        List<Fertiliser> fertiliserList = new ArrayList<>();
        fertiliserList.add(fertiliser);
        fertiliserList.add(fertiliser1);
        fertiliserList.add(fertiliser2);
        fertiliserList.add(fertiliser3);
        fertiliserList.add(fertiliser4);
        farm.setFertilisers(fertiliserList);

        List<Machinery> machineryList = new ArrayList<>();
        machineryList.add(machinery);
        machineryList.add(machinery1);
        machineryList.add(machinery2);
        machineryList.add(machinery3);
        farm.setMachinery(machineryList);

        List<Medication> medicationList = new ArrayList<>();
        medicationList.add(medication);
        medicationList.add(medication1);
        medicationList.add(medication2);
        medicationList.add(medication3);
        farm.setMedication(medicationList);

        List<Treatment> treatmentList = new ArrayList<>();
        treatmentList.add(treatment1);
        treatmentList.add(treatment2);
        treatmentList.add(treatment);
        treatmentList.add(treatment3);
        farm.setTreatment(treatmentList);


        employer.sack(farm, employee3);
        employer.sack(farm, employee);
        employer.sack(farm, employee1);
        employer.sack(farm, employee2);
        employer.sack(farm, employee4);
        employer.sack(farm, employee5);
        employer.sack(farm, employee6);
        employer.sack(farm, employee7);

        for(int i = 0; i < farm.getEmployees().size(); i++){
            System.out.println(farm.getEmployees().get(i).getName());
        }
    }
}
