import java.util.Scanner;

public class Cylinder extends Cricle {
    // thuoc tinh
    Scanner sc = new Scanner(System.in);
    public float chieuCao;
    // phuong thuc
    public Cylinder(){
        ten = "Cylinder";
    }
    public void nhapChieuCao() {
        super.nhapBanKinh();
        System.out.print(" Chieu cao la:");
        chieuCao = sc.nextFloat();
    }
    public void tinhTheTich() {
        theTich = pi * banKinh * banKinh * chieuCao;
    }
    
}
