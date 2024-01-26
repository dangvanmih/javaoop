import java.util.Scanner;

public class slide30chuong2 {
    public static void main(String[] args) throws Exception {
        
        int n,tong=0,sodu;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n = : ");
        n = sc.nextInt();
        while(n > 0)
        {
            sodu = n % 10;
            n = n / 10;
           tong += sodu;
        }
        System.out.println(" tong so nguyen n la: " + tong);

        
    }
}

