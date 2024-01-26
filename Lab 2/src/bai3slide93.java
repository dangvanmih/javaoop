import java.util.Scanner;

public class bai3slide93 {
    public static void main(String[] args) throws Exception {
        String ten;
        int tuoi,namsinh;
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap ten :");
        ten = sc.nextLine();
        System.out.println(" nhap nam sinh: ");
        namsinh = sc.nextInt();
        tuoi = 2024 - namsinh;
        if(tuoi < 16)
        System.out.print("ban " + ten + " o tuoi vi thanh nien");
        else if(tuoi >= 16 && tuoi < 18){
        System.out.print("ban" + ten + " o tuoi truong thanh");}
        else{
        System.out.print("ban" + ten + " da gia");}

}
}
