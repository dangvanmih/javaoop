package Slide80Chuong3;

import java.util.Scanner;

public class NhanVienPartTime extends NhanVien{
    Scanner sc = new Scanner(System.in);
    public int gioLamViec;
    public NhanVienPartTime(String ten,int gioLamViec) {
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }
    @Override
    public String loaiNhanVien() {
        return " Day La Nhan Vien PartTime";
    }
    public void tinhluong() {
        luong = gioLamViec * Configs.LUONG_PARTTIME_NHAN_VIEN_MOI_GIO;
    }

    
}
