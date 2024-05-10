package Chuong4.Slide;
import java.util.ArrayList;
import java.util.Scanner;
public class Slide23 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListIntegers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so phan tu cho mang Arraylist: ");
        n = sc.nextInt();
        for(int i = 0 ; i < n ; i++) {
            System.out.println("Nhap phan tu thu " + i);
            int number = sc.nextInt();
            arrayListIntegers.add(number);
        }
        int max = arrayListIntegers.get(0);
        for(int i = 1; i < arrayListIntegers.size();i++) {
            if(arrayListIntegers.get(i).compareTo(max) > 0) {
                max = arrayListIntegers.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong arraylistinteger la " + max);
    }

    
}


