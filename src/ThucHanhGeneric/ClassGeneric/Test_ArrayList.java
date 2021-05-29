package ThucHanhGeneric.ClassGeneric;

public class Test_ArrayList {
    public static void main(String[] args) {
        Pair<String, String> one = new Pair<>("One", "1");
        Pair<String, String> dog = new Pair<>("Dog", "Cho");
        Pair<String, String> cat = new Pair<>("Cat", "Meo");
        Pair<String, Integer> iphone = new Pair<>("Iphone12", 3500000);
        Student st1 = new Student();
        st1.setName("Chinh");
        Student st2 = new Student();
        st2.setName("Linh");
        Pair<Student, Student> check = new Pair<>(st1, st2);

        System.out.println(one.getK() + " = " + one.getV());
        System.out.println(iphone.getK() + " = " + iphone.getV());
        System.out.println(_toString(check.getK()) + " = " + _toString(check.getV()));
    }

    public static String _toString(Student student) {
        return student.getName();
    }


}

