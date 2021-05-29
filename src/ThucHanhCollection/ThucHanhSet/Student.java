package ThucHanhCollection.ThucHanhSet;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private Integer age;

    public Student(String _name, Integer _age) {
        this.name = _name;
        this.age = _age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        boolean check = Objects.equals(getName(), student.getName()) &&
                Objects.equals(getAge(), student.getAge());
        System.out.println("equals " + check);
        return check;

    }

    @Override
    public int hashCode() {
        int a = Objects.hash(getAge());
        System.out.println("hasd code  " + a);
        return a;
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}
