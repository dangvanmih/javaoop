import java.util.Scanner;

public class slide74chuong2 {
    public static void main(String[] args) {
        int n;
        double tong = 0;
        Scanner sc = new Scanner(System.in);
        do
        {
        System.out.print("nhap so phan tu cua mang: ");
        n = sc.nextInt();
        }
        while (n < 0);
        {
           int A[] = new int [n];
           System.out.println("nhap phan tu cho mang: ");
           for(int i = 0 ; i < n ; i++)
           {
            System.out.println("nhap phan tu thu " +i +":");
            A[i] = sc.nextInt();
           }
           for(int i = 0 ; i < n ; i++)
           {
            if (A[i] % 2 == 0)
            {
                tong += A[i]; 
            }

           }
           System.out.print("tong cac so chan tronmg mang la: " + tong);



        }







    }
    
}
