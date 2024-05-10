package Chuong4.Slide;

import java.util.ArrayList;

public class Slide17 {
    public static void main(String[] args) {
        ArrayList<String> arrayListsStrings = new ArrayList<>();
        arrayListsStrings.add("JAVA");
        arrayListsStrings.add("PHP");
        arrayListsStrings.add("C#");
        arrayListsStrings.add("C++");
        System.out.println("Cac Phan Tu Co Trong ArraylistStrings la: ");
        for(int i = 0 ; i < arrayListsStrings.size(); i++) {
            System.out.println(arrayListsStrings.get(i) + "\t");
        }
    }
    
}
