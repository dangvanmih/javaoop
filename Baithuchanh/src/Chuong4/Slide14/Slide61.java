package Chuong4.Slide14;

import java.util.LinkedHashSet;
import java.util.Set;

public class Slide61 {
    public static void main(String[] args) {
        Set<String> LinkedhashSet = new LinkedHashSet<String>();
        LinkedhashSet.add("Java");
        LinkedhashSet.add("C++");
        LinkedhashSet.add("Java");
        LinkedhashSet.add("PHP");
        for(String str : LinkedhashSet) {
            System.out.println(str);
        }
    }
    
}
