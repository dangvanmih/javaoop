package Chuong4;

import java.util.LinkedHashMap;
import java.util.Map;
public class Slide95 { 
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
        hm.put(100, "Mo");
        hm.put(101, "Dia");
        hm.put(102, "Chat");
        for(Map.Entry<Integer, String> m:hm.entrySet())
        System.out.println(m.getKey()+ " " +m.getValue());
        System.out.println("Truoc khi xoa phan tu" + hm);
        hm.remove(101);
        System.out.println("Sau khi xoa phan tu" + hm);
        

    }
    
}
