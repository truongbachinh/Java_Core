package OOP.Inheritance;

public class Entry {
    public static void main(String[] args) {

    }
}

class Personssss {
    private String name;
    private int age;
    private String address;

    public Personssss(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void display()
    {
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Address: "+ address);

    }
}

class Student extends Personssss {
    private double gpa;

    public Student(String name, int age, String address, double gpa) {
        super(name,age,address);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("GPA: "+ gpa);

    }
}
class Teacher extends Personssss {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age,String address, int salary) {
        super(name,age,address);
        this.salary = salary;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("Salary: " +salary);
    }

}

