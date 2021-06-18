package ThucHanhConcurrent.ConcurrentCollection.CopyOnWriteArraySet;

import java.util.concurrent.CopyOnWriteArraySet;

public class Writer  extends  Thread{
    private CopyOnWriteArraySet<Integer> list;

    public Writer(String name, CopyOnWriteArraySet<Integer> list) {
        this.list = list;
        super.setName(name);
    }
    public void run() {
        int count = 6; // biến riêng của từng thread
        while (true) {
            try {
                Thread.sleep(500);

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            list.add(count++);
            System.out.println(super.getName() + " done");
        }
    }
}
