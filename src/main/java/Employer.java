public class Employer extends Person{
    public Employer(String name) {
        super(name);

    }

    public void sack(Farm farm, Employee employee){
        if(employee.getPunctuality().equals("late")){
            farm.getEmployees().remove(employee);
            System.out.println(employee.getName() + " due to lateness, you have been sacked from " + farm.getName());
        }else{
            System.out.println(employee.getName() + " Keep it up");
        }
    }
}
