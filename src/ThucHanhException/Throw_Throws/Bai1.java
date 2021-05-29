package ThucHanhException.Throw_Throws;

import java.util.Scanner;

class userException extends Exception {

    public userException(String message) {
        super(message);
    }
}

public class Bai1 {
    private String name;
    private int age;


    public Bai1(String name, int age) {
        try {
            if (age < 0 || age > 99) {
                userException ex = new userException("Tuổi lớn quá r");
                throw ex;
            }

        } catch (userException ex) {
            ex.printStackTrace();
        }
        this.name = name;
        this.age = age;
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

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();


        Bai1 bh = new Bai1(name, age);
        System.out.print("Get name: ");
        System.out.println(bh.getName());
        System.out.println("Get age:" + bh.getAge());
    }
}
