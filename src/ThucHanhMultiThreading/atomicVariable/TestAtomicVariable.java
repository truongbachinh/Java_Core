package ThucHanhMultiThreading.atomicVariable;

public class TestAtomicVariable {
    // số lượng thread tạo ra và dùng atomic variable để kiểm soát và đếm thread
    static final int numberThread = 100;

    public static void main(String[] args) {
        Counter counter = new Counter();
        // tạo ra 1 mảng thread gồm 100 thread;
        Thread[] threads =  new Thread[numberThread];
        for (int i = 0; i < numberThread; i++) {
            threads[i] = new UpdateCounter(counter); // khởi tạo thread để đếm counter.
            threads[i].start(); // bắt đầu cho từng thread; start gọi đến hàm run() của class UpdateCounter để chạy đa luồng và
        }
        for (int i = 0; i < numberThread; i++) {

            try {
                threads[i].join();
            }catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Get counter Atomic variable: " + counter.getValue());
        // nếu class UpdateCoutn khong cài đặt các hàm đồng bộ thì sẽ xãy ra lỗi
        // => sử dụng synchronized or look.look() vào thân hàm của function.
    }
}
