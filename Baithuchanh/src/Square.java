import java.util.Scanner;

public class Square extends rectangle {
    // thuoc tinh
    Scanner sc = new Scanner(System.in);
    // phuong thuc
    public Square() {
        ten = " Square";
    }
    public void nhapCanh() {
        System.out.print("Nhap Canh:");
        dai = rong = sc.nextFloat();
    }
}
