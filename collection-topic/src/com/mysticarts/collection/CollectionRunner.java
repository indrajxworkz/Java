package com.mysticarts.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionRunner {
    public static void main(String[] args) {
        Collection<String> collection  = new ArrayList();
        Collection<String>collection1 = new ArrayList();



        collection.add("Dairy Milk");
        collection.add("London Dairy");
        collection.add("Kit Kat");
        collection.add("Amul");
        collection.add("Five Star");
        collection.add("Eclairs");
        collection1.add("Unibic Cookies");
        collection1.add("Hide and Seek Fab");
        collection1.add("Jim Jam");

        collection.addAll(collection1);
        collection.remove("Unibic Cookies");
        System.out.println(collection.size());
        System.out.println(collection);
        boolean isthere1 =  collection.containsAll(collection);
        boolean isthere =  collection.contains("Dairy Milk");
        collection.retainAll(collection1);


        System.out.println(isthere);
        System.out.println(isthere1);

        for (String st : collection){
            System.out.println((String) st);
        }

        Iterator <String> iterator  = collection1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
