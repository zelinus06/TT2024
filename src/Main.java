import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = "D:\\BEJava\\file1.txt";
        writeBinaryFile(filePath);
        readBinaryFile(filePath);

    }
    //Write file from text
    private static void writeTextFile(String filePath) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            DataOutputStream dos = new DataOutputStream(fos);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap du lieu vao file:");
            String input = scanner.nextLine();
            dos.writeUTF(input);
            System.out.println("Ghi du lieu thanh cong");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi dữ liệu vào file: " + e.getMessage());
        }
    }

    // Read file from text
    public static void readTextFile(String filePath) {
        File file = new File(filePath);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("Du lieu trong file la:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Write File from binary
    public static void writeBinaryFile(String filePath) {
        File file = new File(filePath);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap du lieu vao file:");
            String input = sc.nextLine();
            fos.write(input.getBytes());
            System.out.println("Ghi du lieu thanh cong");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Read File from binary
    public static void readBinaryFile(String filePath) {
        try {
            FileInputStream readFile = new FileInputStream(filePath);
            int line;
            System.out.println("Du lieu trong file la:");
            while ((line = readFile.read()) !=  -1) {
                System.out.print((char)line);
            }
            readFile.close();
        } catch (IOException e) {
            System.out.println("Lỗi: Không thể đọc tệp tin.");
            e.printStackTrace();
        }
    }

}
