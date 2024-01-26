import java.util.Scanner;

public class bai5slide94 {
    public static void main(String[] args) {
        int n,tong = 0;
        String strResoult = " ";
        Scanner sc = new Scanner(System.in);
        while (tong <= 100) {
        System.out.println("nhap n: ");
        n = sc.nextInt();
        tong += n;
        strResoult = strResoult + n + " + ";
        }
        strResoult = strResoult.substring(0,strResoult.length()-2);
        System.out.println(strResoult + "= " + tong + " ");
        sc.close();
        

            
        


    }
}
