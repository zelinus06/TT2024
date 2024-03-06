package Calculate;

import java.util.Scanner;

public class Staff {
    private static String name;
    private String phoneNumber;
    private double salary;

    public Staff () {};

    public Staff (String name, String phoneNumber, double salary) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
//    Input the detail of staff
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten nhan vien");
        String name  = sc.nextLine();
        setName(name);
        System.out.println("Nhap so dien thoai ");
        String phoneNumber = sc.next();
        setPhoneNumber(phoneNumber);
    }
    public void output() {
        System.out.print(getName()+"+"+getPhoneNumber()+"+");
    }
}

