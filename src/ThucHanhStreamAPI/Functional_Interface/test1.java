package ThucHanhStreamAPI.Functional_Interface;

@FunctionalInterface
interface sayAble {
     void say(String msg);

    default void sayAble2(String msg) {
        System.out.println(msg);
    }
    static void sayAble3(String msg) {
        System.out.println(msg);
    }
}
public class test1 implements  sayAble{
    @Override
    public void say(String msg) {
        System.out.println(msg);
    }



    public static void main(String[] args) {
        test1 t = new test1();
        t.say("hello");
        t.sayAble2("hello");
        sayAble:sayAble.sayAble3("Linh");
    }
}
