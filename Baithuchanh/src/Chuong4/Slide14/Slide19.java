package Chuong4.Slide14;

import java.util.ArrayList;
import java.util.ListIterator;

public class Slide19 {
    public static void main(String[] args) {
        ArrayList<Character> arrayListchar = new ArrayList<>();
        arrayListchar.add('a');
        arrayListchar.add('e');
        arrayListchar.add('b');
        arrayListchar.add('c');
        ListIterator<Character> listIterator = arrayListchar.listIterator();
        System.out.println("Cac phan tu co trong arrlistchar la");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next()+"\t");
            
        }
    }
    
}
