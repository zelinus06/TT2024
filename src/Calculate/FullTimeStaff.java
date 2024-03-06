package Calculate;

import java.util.Scanner;

public class FullTimeStaff extends Staff implements Calculator{
    private int day;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public int CalculateSalary() {
        return 180*day;
    }
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so ngay cong");
        int day = sc.nextInt();
        setDay(day);
    }
    public void output() {
        super.output();
        System.out.println(getDay()+"+"+CalculateSalary()+"k");
    }
}
