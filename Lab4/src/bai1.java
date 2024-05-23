import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>  arrayListInteger = new ArrayList<>();
        System.out.println("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++)
        {
        System.out.println("phan tu thu " + (i+1));
        int values = sc.nextInt(); 
        arrayListInteger.add(values);
        
    }
    
    int max = arrayListInteger.get(0);
    for(int x : arrayListInteger)
        if(x > max) {
            max = x;
            
        }
        System.out.println("phan tu lon nhat la: " + max);
    System.out.println("Nhap vao mot so nguyen: ");
    int values = sc.nextInt();
    if(arrayListInteger.contains(values)) {
        for(int i = 0;i<arrayListInteger.size();i++)
            if(arrayListInteger.get(i) == values)
            arrayListInteger.remove(i);
        System.out.println("xoa phan tu thanh cong");
        System.out.println("phan tu con lai trong arraylistInteger sau khi xoa" + arrayListInteger);
            
        }
        
    else {
        System.out.println("Phan tu " + values + " khong hop le");
    }
    arrayListInteger.sort((o1,o2) ->(o2-o1));
    System.out.println("day so sau khi sap xep" + arrayListInteger);
}
}
