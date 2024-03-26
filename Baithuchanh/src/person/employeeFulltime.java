package person;

public class employeeFulltime extends employee {
    public int day;
    public int month;
    public employeeFulltime() {
        vitri = "employeeFulltime";
        day = 0;
        month = 0;
    }
    public void enterData() {
        super.enterData();
        System.out.println("So ngay lam:");
        day = sc.nextInt();
        System.out.println("so thang lam");
        month = sc.nextInt();
    }
    public void safary() {
        if(month <= 3) {
            luong = luong * day * 8  + 200000;
        }
        else {
            luong = luong * day * 8 + 500000;
        }
    }
    public void disPlay() {
        super.disPlay();
        System.out.println("Luong cua nhan vien fulltime la:" + luong);
    }


}
