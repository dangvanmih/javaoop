package person;

import java.util.Scanner;

public class employeeParttime extends employee {
    public int hour;
    Scanner sc = new Scanner(System.in);
    public employeeParttime() {
        vitri = " employParttime ";
        hour = 0;
    }
    public void enterData() {
        super.enterData();
        System.out.println("So gio lam viec :");
        hour = sc.nextInt();
    }
    public void safary() {
        luong = luong * hour;
    }
    public void disPlay() {
        super.disPlay();
        System.out.println("Luong employeeParttime la:" + luong);
    }
}

    
