package ThucHanhConcurrent.ConcurrentCollection.CopyOnWriteArraySet;

import java.util.concurrent.CopyOnWriteArraySet;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> list = new CopyOnWriteArraySet<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        new Writer("Writer 1", list).start();
        new Writer("Writer 2", list).start();

        new Reader("Reader 1", list).start();
        new Reader("Reader 2", list).start();
    }

}
