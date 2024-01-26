import java.util.Scanner;

public class slide35chuong2 {

    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so a : ");
        a = sc.nextInt();
        System.out.print("nhap so b :");
        b = sc.nextInt();
        if(a > b)
        System.out.print("so nho nhat la: b");
        else if(a==b)
        System.out.println("so nho nhat la a va b");
        else
        System.out.print("so nho nhat la: a");
        
    }
}