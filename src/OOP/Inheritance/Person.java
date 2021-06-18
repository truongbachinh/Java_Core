package OOP.Inheritance;

public abstract class Person {
    public static void main(String[] args) {
        Person p = new Person() {
            @Override
            void display() {

            }
        };
        p.d();
    }


    private String name;
    private String address;

    public void d() {
        System.out.println("A");
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    abstract void display();


}

class Employes extends Person {
    private int salary;

    public Employes(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("Employee name: " + super.getName());
        System.out.println("Employee address: " + super.getAddress());
        System.out.println("Employee salary: " + salary);
    }
}

class Customer extends Person {
    private int balance;
    void display1()
    {

    }
    int display1(String name)
    {
        return 1;
    }
    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }

    @Override
    public void display() {
        System.out.println("Customer name: " + super.getName());
        System.out.println("Customer address: " + super.getAddress());
        System.out.println("Customer balance: " + balance);
    }

}
