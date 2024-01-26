import java.util.Scanner;
public class tinhchanle {

    public static void main(String[] args) {
        double a;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a");
        a = sc.nextDouble();
       if(a%2==0)
        {
    
            System.out.println(" ket qua la so chan");
        }
        else if(a%2==1)
        {
            System.out.println(" ket qua la so le");
        }
        
    }
}