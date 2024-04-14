package Slide80Chuong3;

import java.util.Scanner;

public class NhanVienFullTime extends NhanVien{
    Scanner sc = new Scanner(System.in);
    //thuoctinh
    public int ngayLamThem;
    public int loaichucvu;
    //phuongthuc
    public NhanVienFullTime(String ten) {
        this.ten = ten;
    }
    public NhanVienFullTime(String ten , int ngayLamThem) {
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }
    public void Setloaichucvu(int loaichucvu) {
        this.loaichucvu = loaichucvu;
    }
    @Override
    public String loaiNhanVien() {
        return" nhanVienFullTime ";
    }
    public void tinhluong() {
        if(loaichucvu == 0)
        {
            luong = Configs.LUONG_NHAN_VIEN_FULLTIME_SEP + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        }
        else if(loaichucvu == 1) {
            luong = Configs.LUONG_NHAN_VIEN_FULLTIME_LINH + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        }

    }
}
