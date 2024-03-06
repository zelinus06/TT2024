package Calculate;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    static ArrayList<Staff> list = new ArrayList<>();
// select type of staff
    public void SelectType() {
        Scanner choose = new Scanner(System.in);
        Staff st = null;
        System.out.println("1. FullTime Staff");
        System.out.println("2. PartTime Staff");
        int type = choose.nextInt();
        switch (type) {
            case 1:
                //Upcasting
                st = new FullTimeStaff();
//                System.out.println("day la 1");
                break;

            case 2:
                //Upcasting
                st = new PartTimeStaff();
//                System.out.println("day la 2");
                break;

        }
        st.input();
        list.add(st);
        for (Staff staff : list) {
            staff.output();
    }
}
}