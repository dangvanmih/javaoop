package Chuong4.Slide14;

import java.util.HashSet;
import java.util.Scanner;

public class Sldie57 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        // them cac phan tu vao hashSetStirng
        hashSetString.add("wilson");
        hashSetString.add("Nike");
        hashSetString.add("Volvo");
        hashSetString.add("Kia");
        hashSetString.add("Lenovo");
        hashSetString.add("Lenovo");
        // hien thi cac phan tu trong hashSetString
        System.out.println("Cac phan tu co trong hashSetString la: " + hashSetString);
        System.out.println("Nhap phan tu can xoa: ");
        name = sc.nextLine();
        // neu phan tu do ton tai hashSetString thi thong bao xoa thanh cong
        // va hien thi cac phan tu con lai, nguoc lai thong bao xoa khong thanh cong
        if(hashSetString.contains(name)) {
            hashSetString.remove(name);
            System.out.println("Xoa thanh cong");
            System.out.println("Cac phan tu con lai trong hashSetString la " + hashSetString);
        }
        else {
            System.out.println("Xoa khong thanh cong");
        }

        
    }
}
