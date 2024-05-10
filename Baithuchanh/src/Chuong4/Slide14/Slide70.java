package Chuong4.Slide14;

import java.util.Scanner;
import java.util.TreeSet;

public class Slide70 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treeSetiIntegers = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        // them cac phan tu vao treeSetInteger
        treeSetiIntegers.add(0);
        treeSetiIntegers.add(3);
        treeSetiIntegers.add(1);
        treeSetiIntegers.add(4);
        treeSetiIntegers.add(2);
        treeSetiIntegers.add(8);
        // hien thi cac phan tu trong treeSetInteger
        System.out.println("Cac phan tu trong treeSetInteger " + treeSetiIntegers);
        // them phan tu nhap tu ban phim
        System.out.println("Nhap phan tu can them: ");
        number = sc.nextInt();
        // kiem tra neu phan tu chua ton tai thi them vao va hien thi thong bao them thanh cong nguoc lai thong bao da ton tai
        if(!treeSetiIntegers.contains(number)) {
            treeSetiIntegers.add(number);
            System.out.println("Them tu tu thanh cong");
            System.out.println("Cac phan tu trong treeSeInteger sau khi them vao: " + treeSetiIntegers);

        }
        else { 
            System.out.println("Phan tu " + number + " da ton tai");
        }
    }
    
}
