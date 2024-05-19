package Chuong4.Slide;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Slide107 { 
    public static void main(String[] args) {
        TreeMap<Integer, Character> treeMap = new TreeMap<>();
        treeMap.put(6, 'A');
        treeMap.put(5, 'B');
        treeMap.put(1, 'C');
        treeMap.put(2, 'E');
        Set<Map.Entry<Integer, Character>> setTreeMap = treeMap.entrySet();
        System.out.println("Cac entry co trong setTreeMap:" + setTreeMap);

    }
    
}
