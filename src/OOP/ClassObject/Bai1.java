package OOP.ClassObject;

import java.util.Scanner;

class Student {
    String name;
    int age;

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Age:" + getAge());
    }
    public void getInformation()
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age =  sc.nextInt();
        sc.close();
        setName(name);
        setAge(age);

    }

}

public class Bai1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getInformation();
        s1.display();
    }
}
