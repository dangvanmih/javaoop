import java.util.Scanner;

public class rectangle extends HinhHoc {
//thuoc tinh
 public float dai;
 public float rong; 
 Scanner sc = new Scanner(System.in);
//phuong thuc
public rectangle() {
    ten = " retangle";
}   
public void nhapChieuDai() {
    System.out.print("Nhap chieu dai:");
    dai = sc.nextFloat();
}
public void nhapChieuRong() {
    System.out.print("Nhap chieu rong:");
    rong = sc.nextFloat();
}
public void tinhChuVi() {
    chuVi = (dai + rong)*2;
}
public void tinhDienTich() {
    dienTich = dai * rong;
}
}
