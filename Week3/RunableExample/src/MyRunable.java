public class MyRunable implements Runnable{
    protected boolean isRunning = true;

    @Override
    public void run() {
        while (isRunning) {
            System.out.println("Đang chạy Runable example");
            try {
                Thread.sleep(2000); // Tạm ngừng 1 giây
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void stopThread() {
        isRunning = false;
    }
}
