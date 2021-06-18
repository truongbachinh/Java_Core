package ThucHanhConcurrent.ConcurrentCollection.BlockingQueue.BaiTapArrayBlockingQueue;

import java.io.File;
import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class FileTextSearch {
    public static void main(String[] args) {
        String dirPath = args[0];// thư mục
        String extension = args[1];// file extention
        String keyword = args[2]; // keyword
        // 100
        BlockingQueue<File> queue = new PriorityBlockingQueue<>(1000, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return o1.compareTo(o2);
            }
        });

        DirectoryLister lister
                = new DirectoryLister(queue, new File(dirPath), extension);
        lister.start();

        for (int i = 0; i < 10; i++) {
            FileParser parser = new FileParser(queue, keyword);
            parser.start();
        }
    }
}
