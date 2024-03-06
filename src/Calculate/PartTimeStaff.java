package Calculate;

import java.util.Scanner;

public class PartTimeStaff extends Staff implements Calculator {
    private int hours;

    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public int CalculateSalary() {
        return hours*20;
    }
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so gio");
        int hours = sc.nextInt();
        setHours(hours);
    }
    public void output() {
        super.output();
        System.out.println(getHours()+"+"+CalculateSalary()+"k");
    }
}
