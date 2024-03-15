import java.security.PublicKey;
import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    // Fleds
  public String Hodem;
  public String Ten;
  public String Gioitinh;
  public int DiemA,DiemB,DiemC;
  public int DiemTrungBinh;
    // Methods
  public void NhapHoDem() {
    System.out.println("Ho Dem La:");
    Hodem = sc.nextLine();
  }
  public void NhapTen() {
    System.out.println("Ten La:");
    Ten = sc.nextLine();
  }
  public void NhapGioiTinh() {
    System.out.println("Gioi Tinh la:");
    Gioitinh = sc.nextLine();
  }
  public void NhapDiem() {
    System.out.println("Nhap Diem A");
    DiemA = sc.nextInt();
    System.out.println("Nhap Diem B");
    DiemB = sc.nextInt();
    System.out.println("Nhap Diem C");
    DiemC = sc.nextInt();
  }
  public void TinhDiemTrungBinh() {
    DiemTrungBinh = (DiemA + DiemB + DiemC)/3; 
  }
  public void hienThiKetQua() {
    System.out.println("Diem Trung Binh La:" + DiemTrungBinh);
  }

    
}
