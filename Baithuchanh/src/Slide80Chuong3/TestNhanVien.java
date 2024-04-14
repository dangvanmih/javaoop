package Slide80Chuong3;

public class TestNhanVien {
    public static void main(String[] args) {

        NhanVienFullTime sep = new NhanVienFullTime("Nguyen Van A");
        sep.Setloaichucvu(Configs.NHAN_VIEN_SEP);
        NhanVienFullTime linh = new NhanVienFullTime("Nguyen Thi B",5);
        linh.Setloaichucvu(Configs.NHAN_VIEN_LINH);
        NhanVienFullTime linh1 = new NhanVienFullTime("Nguyen Thi A ");
        linh1.Setloaichucvu(Configs.NHAN_VIEN_LINH);
        NhanVienPartTime thoivu = new NhanVienPartTime("Dinh Van Cuong",200);
        sep.tinhluong();
        linh.tinhluong();
        linh1.tinhluong();
        thoivu.tinhluong();
        sep.xuatThongTin();
        linh.xuatThongTin();
        linh1.xuatThongTin();
        thoivu.xuatThongTin();
    }
    
}
