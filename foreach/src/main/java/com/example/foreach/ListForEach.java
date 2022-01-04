package com.example.foreach;

import java.util.ArrayList;
import java.util.List;

public class ListForEach {

    public static void list () {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // method reference
        list.forEach(System.out::println);
        System.out.print("\n");
    }
}
