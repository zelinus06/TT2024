package AtomicInteger;

import com.sun.tools.attach.AttachPermission;

import java.util.ArrayList;

public class AtomicExample extends Thread{
    ArrayList<String> list = new ArrayList<>();
    public void start() {
        list.add("Thai");
        list.add("Long");
    }
    public void minus() {
        list.remove("Long");
    }
    public void GetAll() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
