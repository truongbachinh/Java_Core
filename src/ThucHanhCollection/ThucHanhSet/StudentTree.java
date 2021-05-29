package ThucHanhCollection.ThucHanhSet;

public class StudentTree implements Comparable<StudentTree> {
    private String name;
    private Integer age;

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
        return "StudentTree{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(StudentTree o) {
        return this.name.compareTo(o.name);
    }
}
