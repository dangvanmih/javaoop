import java.util.Scanner;

public class slide47chuong2 {

    public static void main(String[] args) {
        int n,tong = 0;
        Scanner sc = new Scanner(System.in);
        while (tong < 100) {
            System.out.print("nhap so nguyen n ");
            n = sc.nextInt();
            tong += n;
            System.out.println("tong cac so vua nhap la: " + tong);
            

            
        }
    }
}
