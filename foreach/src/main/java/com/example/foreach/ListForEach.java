package com.example.foreach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListForEach {

    public static void list () {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("T");

        // method reference
        list.forEach(System.out::println);
        System.out.print("\n");
    }
}
