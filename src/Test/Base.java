package Test;


public class Base {

    protected int protectedMember = 3;
    private int privateMember = 7;

    public class Nested {

        public int getPrivate() {
            return privateMember;
        }

        public int getProtected() {
            return protectedMember;
        }

    }

}

class Derived extends Base.Nested {
    //Provide the Base instance that contains Enclosing.Nested
    public Derived() {
        new Base().super();
    }

    //Access protected member of Enclosing class
    public void accessProtectedMember() {
        System.out.println(getProtected());
    }

    //Access private Member of Enclosing class
    public void accessPrivateMember() {
        System.out.println(getPrivate());
    }
}
class Test {
    public static void main(String... args) {
        Derived derived = new Derived();
        derived.accessProtectedMember();
        derived.accessPrivateMember();
    }
}
