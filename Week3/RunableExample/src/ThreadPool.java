import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
    MyRunable obj = new MyRunable();
    public void execute() {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.execute(() -> {
            while (obj.isRunning) {
                System.out.println("Đang chạy ThreadPool");
                try {
                    Thread.sleep(2000); // Tạm ngừng 2 giây
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
