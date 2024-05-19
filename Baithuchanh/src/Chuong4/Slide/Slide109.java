package Chuong4.Slide;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Slide109 { 
    public static void main(String[] args) {
        TreeMap<Integer, Double> treeMap = new TreeMap<>();
        treeMap.put(1, 9d);
        treeMap.put(4, 10.1d);
        treeMap.put(2, 7.2d);
        treeMap.put(8, 20.2d);
        System.out.println("cac phan tu co trong treeMap: ");
        Set<Map.Entry<Integer, Double>> setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);
        //thay the value cua Entry co khoa la 4 thanh 22.2d
        treeMap.replace(4, 22.2d);
        System.out.println("Cac phan tu trong setTreeMap sau khi bi thay the: " );
        setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap );
    }
    
}
