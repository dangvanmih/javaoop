package Chuong4.Slide;

import java.util.HashSet;
import java.util.TreeSet;

public class Slide51 {
    public static void main(String[] args) {
        // khai bao mot HashSet co ten la hashSetInt có kiểu là Integer
        HashSet<Integer> hashSetInt = new HashSet<>();
        // khai bao mot HashSet co kich thuoc khoi tao = 32
        HashSet<Character> hashSetChar = new HashSet<>(32);
        // khai bao HashSet co kich thuoc khoi tao = 16 va yeu to tai = 0.75f(mac dinh)
        HashSet<String> hashSetString = new HashSet<>(16, 0.75f);
        // khai bao mot HashSet duoc tao thanh tu mot collection khac
        HashSet<Float> hashSetFloat = new HashSet<>(new TreeSet<>());

    }
    
}
