import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Tạo thread runable
        MyRunable RunableThread = new MyRunable();
        Thread runableThread = new Thread(RunableThread);

        //Tạo threadpool
        ThreadPool threadpool = new ThreadPool();
        ThreadPool threadPool1= new ThreadPool();
        // Chạy 2 thread
        threadpool.execute();
        threadPool1.execute();
        runableThread.start();

        // sau 6s, dung thread
        try {
            runableThread.sleep(6000);
            RunableThread.stopThread();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}