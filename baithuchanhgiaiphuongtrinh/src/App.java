import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    double a , b;
        double nghiem;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        a = sc.nextDouble();
        System.out.println("nhap b");
       
        b = sc.nextDouble();
        System.out.println("Phuong trinh co dang: " + a + " x +" + b + " = 0"); 
        if(a==0){
            if(b==0){
                System.out.println("phuong trinh vo so nghiem");}
            else {
                System.out.println("phuong trinh vo nghiem");
            }
        }
        else {
            nghiem = (double) -b / a;
            System.out.println("phuong trinh co nghiem la: " + nghiem);


}
    }
}