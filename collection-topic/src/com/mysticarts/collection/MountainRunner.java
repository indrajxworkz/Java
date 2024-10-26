package com.mysticarts.collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class MountainRunner {

        public static void main(String[] args) {

            Collection<String> mountainNames = new ArrayList();

            Collection addAllMountains = new ArrayList();

            //add-boolean add(Object e)
            mountainNames.add("Mount Everest");
            mountainNames.add("K2");
            mountainNames.add("Kangchenjunga");
            mountainNames.add("Lhotse");
            mountainNames.add("Makalu");
            mountainNames.add("Cho Oyu");
            mountainNames.add("Dhaulagiri");
            mountainNames.add("Manaslu");
            mountainNames.add("Nanga Parbat");
            mountainNames.add("Annapurna");
            System.out.println(mountainNames);

            //addAll-boolean addAll(Collection)
            addAllMountains.addAll(mountainNames);
            System.out.println("Add the All the mountains names: " + addAllMountains);

            //size- int size()
            System.out.println("Size of mountains names: " + mountainNames.size());

            //clear-void clear()
            mountainNames.clear();
            System.out.println("After clearing the mountains names :  " + mountainNames.size());

            //remove-boolean remove(Object o)
            mountainNames.remove("Cho Oyu");
            System.out.println("Mountains names after removing Cho Oyu: " + mountainNames);

            //removeAll-boolean removeAll(Collection e)
            boolean removingAll = addAllMountains.removeAll(mountainNames);
            System.out.println("All names after removing mountain names: " + removingAll);

            //contains-boolean contains(Object e)
            boolean containn = mountainNames.contains("Lhotse");
            System.out.println("Is mountain names contain Lhotse :  " + containn);

            //containsAll-boolean containsAll(Collection e)
            System.out.println("Is mountain Names contain all:  " + addAllMountains.containsAll(mountainNames));

            //retainAll-boolean retainAll(Collection e)
            boolean retain = addAllMountains.retainAll(mountainNames);
            System.out.println("All names after retaining mountains names: " + retain);


            List<String> mountainNames1 = new ArrayList();

            System.out.println("List the  Mountain names: ");
            mountainNames1.add("Mount Everest");
            mountainNames1.add("K2");
            mountainNames1.add("Kangchenjunga");
            mountainNames1.add("Lhotse");
            mountainNames1.add("Makalu");
            mountainNames1.add("Cho Oyu");
            mountainNames1.add("Dhaulagiri");
            mountainNames1.add("Manaslu");
            mountainNames1.add("Nanga Parbat");
            mountainNames1.add("Annapurna");
            System.out.println(mountainNames1);

            //Object get(int index)
            System.out.println("GET THE Mountain NAME BY INDEX : " + mountainNames1.get(6));

            //add(int index , Object e)
            mountainNames1.add(6, "Vanajaji");
            System.out.println("Add the Mountains Name by Index and Object : " + mountainNames1);

            //addALL-addAll(int index , Collection e)
            mountainNames1.addAll(mountainNames);
            System.out.println("Add all the diseases names : " + mountainNames1);


        }
    }

