package Chuong4.Slide14;

import java.util.HashSet;
import java.util.Scanner;

public class Slide55 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSetInt = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        // them cac phan tu vao hashSetInteger
        hashSetInt.add(0);
        hashSetInt.add(3);
        hashSetInt.add(1);
        hashSetInt.add(4);
        hashSetInt.add(2);
        hashSetInt.add(8);
        // hien thi cac phan tu trong hashSetInteger
            System.out.println("Cac phan tu trong hashSetIntegr: ");
            System.out.println(hashSetInt);
            System.out.println("Nhap phan tu can them: ");
            number = sc.nextInt();
            //them mot phan tu moi nhap tu ban phim
            // neu phan tu do ton tai thi thong bao da ton tai nguoc lai thi them vao
            if(!hashSetInt.contains(number)) {
                hashSetInt.add(number);
                System.out.println("Them phan tu thanh cong");
                System.out.println("Cac phan tu trong hashSetInt sau khi them: " + hashSetInt);
            }
            else {
                System.out.println("Phan tu " + number + " da ton tai");
            }
        }
    }
    

