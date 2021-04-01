public class Employee extends Person {
    private String role;
    private String punctuality;

    public Employee(String name, String role, String punctuality) {
        super(name);
        this.role = role;
        this.punctuality = punctuality;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPunctuality() {
        return punctuality;
    }

    public void setPunctuality(String punctuality) {
        this.punctuality = punctuality;
    }
}
