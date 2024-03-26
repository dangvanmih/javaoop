package person;

import java.util.Scanner;

public class person {
    public String fullName;
    public String sex;
    public int age;
    public String addRess;
    public int SDT;
    Scanner sc = new Scanner(System.in);
    public person() {
        fullName = " ";
        sex = " ";
        age = 0;
        addRess = " "; 
        SDT = 0;
    }
    public void enterData() {
        System.out.println("Fullname:");
        fullName = sc.nextLine();
        System.out.println("Sex:");
        sex = sc.nextLine();
        System.out.println("Age:");
        age = sc.nextInt();
        System.out.println("Address:");
        addRess = sc.next();
        System.out.println("SĐT");
        SDT = sc.nextInt();
    }
    public void disPlay() {
        System.out.println(fullName + "-" + sex + "-" + age + "-" + addRess + "-" + SDT);     
    }
    }

