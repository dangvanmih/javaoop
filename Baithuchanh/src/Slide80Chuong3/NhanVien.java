package Slide80Chuong3;

import java.util.Scanner;

public class NhanVien {
    Scanner sc = new Scanner(System.in);
    //thuoc tinh
    public String ten;
    public long luong;
    public String loaiNhanVien;
    //phuong thuc
    public NhanVien() {
        ten = " ";
        luong = 0;
    }
    public NhanVien(String ten) {
    this.ten = ten;
    }
    protected String loaiNhanVien() {
        return " ";
    }
    public void xuatThongTin() {
        System.out.println("=================");
        System.out.println("Ten Nhan Vien: " + ten);
        System.out.println("Loai Nhan Vien" + loaiNhanVien);
        System.out.println("Luong = " + luong + "VND");

    }
    

    }



    

