package com.mysticarts.collection;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<String> collection = new ArrayList<>();
        collection.add("Black Thunder");
        collection.add("Wonderla");
        collection.add("G R S fantasy park");
        collection.add("Fun World");
        collection.add("S L World");
        collection.add("Disney Land");
        collection.add("Snow City");
        collection.add(5,"High Land");
        collection.add(8,"Kings Land");
        //System.out.println(collection);
        System.out.println("The third top most visited Amusement park is  : -> " + collection.get(2));

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
      System.out.println("The Eighth largest park is  : ->"+collection.get(8));

        System.out.println("----------------------------------------------------------------------------------------------");
        Set<String> collection1 = new HashSet<>();
                collection1.add("Ice - Cream");
                collection1.add(null);
                collection1.add("Ice - Cream");
                collection1.addAll(collection);
        System.out.println(collection1);
        Iterator iterator1 = collection1.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("-----------------------------------------------------------------------------------------------");

    }
}
