package OOP.Inheritance;
public class Employee{
    public static void main(String[] args) {
        Employees e = new Employees("Chinh", 2000);
        e.display();
        Manager m = new Manager("Linh",2000,1000);
        m.display();
    }
}
 class Employees {
    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employees(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employees {
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void display() {
        System.out.println("Name: " + super.getName());
        System.out.println("Salary: " +  getSalary());
    }

    @Override
    public int getSalary() {
        return this.bonus + super.getSalary();
    }



    private String name;
    private String address;
    private double gpa;

    public Manager(String name, int salary, String name1, String address, double gpa) {
        super(name, salary);
        this.name = name1;
        this.address = address;
        this.gpa = gpa;
    }
    @Override
    public String toString()
    {
        return String.format("Name: %s, address: %s, GPA: %s" + name + address +gpa);
    }


}
