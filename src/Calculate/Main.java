package Calculate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Manager manage = new Manager();
        manage.SelectType();
    }
}