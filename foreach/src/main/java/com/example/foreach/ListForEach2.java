package com.example.foreach;

import java.util.ArrayList;
import java.util.List;


public class ListForEach2 {

    public static void fruit() {
        List<String> list=new ArrayList<String>();
        //Adding elements in the List
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Iterating the List element using for-each loop
        list.forEach(System.out::println);
        System.out.print("\n");

    }
}
