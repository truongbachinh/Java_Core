package ThucHanhCollection.Queue;

import java.util.PriorityQueue;

public class TestPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Hello");
        pq.add("I");
        pq.add("Am");
        System.out.println("PriorityQueue: " + pq);

        // Using the peek() method
        String element = pq.peek();
        System.out.println("Accessed Element: " + element);
    }
}
