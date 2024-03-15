import java.util.Scanner;

public class Employee {
    // thuoc tinh
    Scanner sc = new Scanner(System.in);

    public String fullName;
    public String gioiTinh;
    public int maNv;
    public int soNgayLam;
    final double Luong = 200000;
    public double LuongCuaThang;

    // phuong thuc
    public void nhapHoVaTen() {
        System.out.println("Ho va ten:");
        fullName = sc.nextLine();
    }
    public void nhapGioiTinh() {
        System.out.println("Nhap Gioi Tinh:");
        gioiTinh = sc.nextLine();
    }
    public void nhapMaNv() {
        System.out.println("Nhap Ma Nv:");
        maNv = sc.nextInt();
    }
    public void nhapSoNgayLam() {
        System.out.println("Nhap So Ngay Lam Trong Thang:");
        soNgayLam = sc.nextInt();
    }
    public void tinhLuong() {
        LuongCuaThang = Luong * soNgayLam;

    }
    public void inLuong() {
        System.out.println(" Luong cua Nhan Vien Vua Nhap la:" + LuongCuaThang);
    }
}

