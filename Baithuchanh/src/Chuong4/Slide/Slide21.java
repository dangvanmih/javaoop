package Chuong4.Slide14;
import java.util.ArrayList;

public class Slide21 {
    public static void main(String[] args) {
        ArrayList<String> person = new ArrayList<String>(3
    );
        person.add("Tay");
        person.add("Chan");
        person.add("Mat");
        person.add("Mui");
        person.add("tai");


        System.out.println(person.get(1));
        System.out.println(person.contains("Chan"));
        System.out.println(person.size());
        System.out.println(person);
    }
    
}
