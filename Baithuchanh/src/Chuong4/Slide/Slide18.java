package Chuong4.Slide;

import java.util.ArrayList;

import java.util.Iterator;
public class Slide18 {
    public static void main(String[] args) {
        ArrayList<Float> arrayListfFloats = new ArrayList<>();
        arrayListfFloats.add(0.7f);
        arrayListfFloats.add(7.26f);
        arrayListfFloats.add(1.02f);
        arrayListfFloats.add(9.3f);
        Iterator<Float> iterator = arrayListfFloats.iterator();
        System.out.println("Cac phan tu co trong arraylistfloat la");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "\t"); 
        }
    }
    
}
