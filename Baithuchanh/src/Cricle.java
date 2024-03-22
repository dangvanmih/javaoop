import java.util.Scanner;

public class Cricle extends HinhHoc{
    //thuoc tinh
    Scanner sc = new Scanner(System.in);
    public float banKinh;
    //phuong thuc
    public Cricle() {
        ten = "Cricle";
    }
    public void nhapBanKinh() {
        System.out.print("Ban kinh:");
        banKinh = sc.nextFloat();
    }
    public void tinhChuVi() {
        chuVi = banKinh * 2 * pi;
    }
    public void tinhDienTich() {
        dienTich = banKinh * banKinh * pi;
    }


    


}
    

