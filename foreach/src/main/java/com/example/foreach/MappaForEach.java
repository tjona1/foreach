package com.example.foreach;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class MappaForEach {

    public static void mappa() {
    Map<String, Integer> mappa = new HashMap<>();
      mappa.put("A", 10);
      mappa.put("B", 20);
      mappa.put("C", 30);
      mappa.put("D", 40);
      mappa.put("E", 50);
      mappa.put("F", 60);
      mappa.put("T", 29);


      mappa.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
        System.out.print("\n");
}
 public void mappaRandom() {
     Map<String, Integer> mappa = new HashMap<>();
     for ( int  i=0; i<6; i++ ){
         Random r = new Random();
         String title = RandomStringUtils.random(4, true, false);
         int number = r.nextInt(100);
         mappa.put(title, number);

     }
     mappa.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
     System.out.print("\n");

 }
    }

