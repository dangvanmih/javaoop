package person;

import java.util.Scanner;

public class employee extends person {
    public String employeeID;
    public String vitri;
    public double luong = 20000;
    Scanner sc = new Scanner(System.in);
    public employee() {
        employeeID = " ";
        vitri = " ";
    }
    public void xuatViTri() {
        System.out.println("======" + vitri + "======");
    }
    public void inVitri() {
        System.out.println("Vi tri:" + vitri);
    }
    public void nhapEmployeeID() {
        super.enterData();
        System.out.println("Nhap ID:");
        employeeID = sc.nextLine();
    }
    public void inThongTin() {
        super.disPlay();
        System.out.println("EmpoyeeID:" + employeeID);
    }
}
