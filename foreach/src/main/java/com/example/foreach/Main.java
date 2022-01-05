package com.example.foreach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// springbootaplication, component o services, 3- autowired

 @SpringBootApplication

public class Main {
  @Autowired
  private static ListForEach a;
  private  static MappaForEach map;

	public static void main(String[] args) {


		SpringApplication.run(Main.class, args);
		MappaForEach.mappa();
		MappaForEach mappaForEach = new MappaForEach();
		mappaForEach.mappaRandom();

        a.list();
		map.mappa();

	}

	}





