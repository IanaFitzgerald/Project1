package lesson6;

public abstract class Employees {
    private String name;
    private int ID;
    private String title;
    private String dateOfBirth;
    private double salary;
    private String address;

    public Employees(String name, int ID, String title, String dateOfBirth, double salary, String address) {
        this.name = name;
        this.ID = ID;
        this.title = title;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void receiveSalary() {
        System.out.println("The salary was sent");
    }

    public String toString() {
        String txt = String.format("Employee name: %s, title: %s, salary: %f", name, title, salary);
    return txt;
    }
}
