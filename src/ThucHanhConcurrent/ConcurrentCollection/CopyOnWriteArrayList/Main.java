package ThucHanhConcurrent.ConcurrentCollection.CopyOnWriteArrayList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
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
