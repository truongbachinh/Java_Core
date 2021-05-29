package ThucHanhCollection.ThucHanh_LinkedList;


import java.util.LinkedList;

public class Test_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");

        System.out.println(ll);

        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
