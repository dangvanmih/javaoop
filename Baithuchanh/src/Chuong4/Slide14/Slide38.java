package Chuong4.Slide14;

import java.awt.List;
import java.util.LinkedList;

public class Slide38 {
    public static void main(String[] args) {
        LinkedList<String> List = new LinkedList<>();
        List.add("JAVA");
        List.add("C++");
        List.add("PHP");
        List.add("JAVA");

        System.out.println("su dung phuong thuc  addall()");
        System.out.println("===================================");
        LinkedList<String> listA = new LinkedList<>();
        listA.addAll(List);
        System.out.println("ListA: " );
        showList(listA);
        System.out.println("su dung phuong thuc retainAll()");
        System.out.println("--------------------------------------");
        LinkedList<String> listB = new LinkedList<>();
        listB.add("JAVA");
        listA.retainAll(listB);
        System.out.println("list : ");
        showList(List);
        System.out.println("Su dung phuong thuc removeAll()");
        System.out.println("---------------------------------");
        List.removeAll(listB);
        System.out.println("list: ");
        showList(List);

    }
    public static void showList(LinkedList<String>List) {
        for(String obj : List)
        {
            System.out.println("\t" + obj + ",");
        }
        System.out.println();
    }
    
}
