import java.util.Scanner;

public class toantu {
    public static void main(String[] args) {
        double a,b,tong,hieu,tich,thuong,chiadu;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a = ");
        a = sc.nextDouble();
        System.out.println(" nhap so b = ");
       b = sc.nextDouble();
       tong = a + b;
       System.out.println(" tong hai so a va b la " + tong);
       hieu = a - b;
       System.out.println(" hieu hai so a va b la " + hieu);
       thuong = a /b;
       System.out.println(" thuong hai so a va b la " + thuong);
       tich = a * b;
       System.out.println(" tich hai so a va b la " + tich);
       chiadu = a % b;
       System.out.println(" chiadu hai so a va b " + chiadu);
       if (a>b)
       {
        System.out.println("ket qua la" + a + ">" + b);
       }
       else if ( a==b)
       {
        System.out.println("ket qua la" + a +" = " + b);
       }
       else
       {
        System.out.println(" ket qua la " + a + "<" + b);
       }

    }
}
