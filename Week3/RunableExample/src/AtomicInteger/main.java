package AtomicInteger;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        AtomicExample thread = new AtomicExample();
        thread.start();
        thread.start();
        thread.GetAll();
    }

}
