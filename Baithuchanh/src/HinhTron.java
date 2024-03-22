import java.util.Scanner;
public class Hinhtron{
    // thuộc tính của hình tròn
    public double banKinh;
    public double chuVi;
    public double dienTich;
    // phương thức
    public void nhapBanKinh() {
        System.out.print("Nhap ban kinh: ");
        Scanner sc = new Scanner(System.in);
        banKinh = sc.nextDouble();       
    }
    public void tinhChuVi() {
        chuVi = banKinh * 2 * Math.PI; 
    }
    public void tinhDienTich() {
        dienTich = banKinh * banKinh * Math.PI;
    }
    public void hienThiKetQua() {
        System.out.printf("Dien tich = %.3f",dienTich);
        System.out.println();
        System.out.printf("Chu vi = %.3f ",chuVi);
    }

    


    
}
