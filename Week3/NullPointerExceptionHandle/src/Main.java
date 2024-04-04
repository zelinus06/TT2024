public class Main {
    public static void main(String[] args) {
        String str3 = "hello";
        try {
            int length3 = str3.length(); // Gây ra NullPointerException
            System.out.println("Độ dài của chuỗi 3 là: " + length3);
        } catch (NullPointerException e) {
            System.out.println("Chuỗi 3 là null!");
        }
    }
}
