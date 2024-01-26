import java.util.Scanner;

public class slide40chuong2 {
    public static void main(String[] args) {
        int ngay;
        Scanner sc = new Scanner(System.in);
       
        System.out.println(" nhap ngay :");
        ngay = sc.nextInt();
        switch (ngay) {
            case 2 :System.out.print(" thu hai");
                
                break;
    
            case 3 :System.out.print(" thu ba");
                        
                break;        
    
       
            case 4 :System.out.print(" thu tu");
                        
                break;
         
            case 5 :System.out.print(" thu nam");
                        
                break;
        
            case 6 :System.out.print(" thu sau");
                        
                break;
         
            case 7 :System.out.print(" thu bay");
                        
                break;
        
            case 0 :System.out.print(" chu nhat");
                        
                        break;
        
           
        }
    }
}
