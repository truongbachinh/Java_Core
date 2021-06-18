package ThucHanhConcurrent.ConcurrentCollection.CopyOnWriteArrayList;

import java.util.List;

public class Writer extends Thread{
    private List<Integer> list;

    public Writer(String name, List<Integer> list) {
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
