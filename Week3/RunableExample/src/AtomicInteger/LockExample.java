package AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class LockExample {
        private int counter = 0;
        private final Lock lock = new ReentrantLock();
        public void increment() {
//            lock.lock();
            try {
                counter++;
            } finally {
//                lock.unlock();
            }
        }
        public int getCounter() {

            return counter;
        }

        public static void main(String[] args) {
            LockExample sharedData = new LockExample();
            Thread thread1 = new Thread(() -> {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                for (int i = 0; i < 10; i++) {
                    sharedData.increment();
                }
            });
            Thread thread2 = new Thread(() -> {
                for (int i = 0; i < 10; i++) {
                    sharedData.increment();
                }
            });
            thread1.start();
            thread2.start();

            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Final counter value: " + sharedData.getCounter());
        }
    }

