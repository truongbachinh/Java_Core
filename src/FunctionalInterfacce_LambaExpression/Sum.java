package FunctionalInterfacce_LambaExpression;

@FunctionalInterface
interface Addable {
    int add(int a, int b);
    static void print(){
        System.out.println("hello");
    }
    int hashCode();
    String toString();
    boolean equals(Object o);
}

public class Sum {
    public static void main(String[] args) {
     Addable addable = (a, b) -> (2-1);
        System.out.println(addable);
    }
}
