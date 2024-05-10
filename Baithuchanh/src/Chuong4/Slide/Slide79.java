package Chuong4.Slide;

import java.util.HashMap;
import java.util.TreeMap;

class Slide79 {
    public static void main(String[] args) {
        //khai bao 1 HasMap ten hasMap1
        // moi phan tu tring hasMap1 bao gom 2 phan 
        // key (Integer) va value (Float)
        HashMap<Integer, Float> hasmap1 = new HashMap<>();
        // khai bao 1 HasMap ten hasMap2
        // moi phan tu trong hasmap2 bao gom 2 phan
        // key (String) va value (String)
        // co kich thuoc khoi tao la = 10
        HashMap<String, String> HashMap2 = new HashMap<>(10);
        //khai bao 1 HashMap co kich thuoc khoi tao = 4
        // yeu to truyen tai = 0.75f(mac dinh)
        // chi tiet ve kich thuoc khoi tao va yeu to tai
        HashMap<Double, Double> hashMap3 = new HashMap<>(4, 0.75f);
        // khai bao 1 HashMap duoc tao thanh tu mot collection khac
        HashMap<Float, Integer> hashMap4 = new HashMap<>( new TreeMap<>());

        
    }

    
}
