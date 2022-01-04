package com.example.foreach;

import java.util.HashMap;
import java.util.Map;

public class MappaForEach {
    public static void mappa() {
    Map<String, Integer> mappa = new HashMap<>();
      mappa.put("A", 10);
      mappa.put("B", 20);
      mappa.put("C", 30);
      mappa.put("D", 40);
      mappa.put("E", 50);
      mappa.put("F", 60);


      mappa.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
        System.out.print("\n");
}


    }

