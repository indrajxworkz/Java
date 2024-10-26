package com.mysticarts.collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DiseaseRunner {


        public static void main(String[] args) {

            Collection<String> diseaseNames = new ArrayList();

            Collection addAllDiseases = new ArrayList();

            //add-boolean add(Object e)
            diseaseNames.add("Diabetes");
            diseaseNames.add("Hypertension");
            diseaseNames.add("Asthma");
            diseaseNames.add("Cancer");
            diseaseNames.add("Alzheimer's");
            diseaseNames.add("Malaria");
            diseaseNames.add("COVID-19");
            diseaseNames.add("Influenza");
            diseaseNames.add("Tuberculosis");
            diseaseNames.add("HIV/AIDS");
            System.out.println(diseaseNames);

            //addAll-boolean addAll(Collection)
            addAllDiseases.addAll(diseaseNames);
            System.out.println("Add the All the diseases names: " + addAllDiseases);

            //size- int size()
            System.out.println("Size of diseases names: " + diseaseNames.size());

            //clear-void clear()
            diseaseNames.clear();
            System.out.println("After clearing the diseases names :  " + diseaseNames.size());

            //remove-boolean remove(Object o)
            diseaseNames.remove("Malaria");
            System.out.println("Diseases names after removing Malaria: " + diseaseNames);

            //removeAll-boolean removeAll(Collection e)
            boolean removingAll = addAllDiseases.removeAll(diseaseNames);
            System.out.println("All names after removing diseases names: " + removingAll);

            //contains-boolean contains(Object e)
            boolean containn = diseaseNames.contains("COVID-19");
            System.out.println("Is diseases names contain COVID-19 :  " + containn);

            //containsAll-boolean containsAll(Collection e)
            System.out.println("Is diseases Names contain all:  " + addAllDiseases.containsAll(diseaseNames));

            //retainAll-boolean retainAll(Collection e)
            boolean retain = addAllDiseases.retainAll(diseaseNames);
            System.out.println("All names after retaining diseases names: " + retain);


            List<String> diseaseNames1 = new ArrayList();

            System.out.println("List the  Game Names: ");
            diseaseNames1.add("Diabetes");
            diseaseNames1.add("Hypertension");
            diseaseNames1.add("Asthma");
            diseaseNames1.add("Cancer");
            diseaseNames1.add("Alzheimer's");
            diseaseNames1.add("Malaria");
            diseaseNames1.add("COVID-19");
            diseaseNames1.add("Influenza");
            diseaseNames1.add("Tuberculosis");
            diseaseNames1.add("HIV/AIDS");
            System.out.println(diseaseNames1);

            //Object get(int index)
            System.out.println("GET THE Disease NAME BY INDEX : " + diseaseNames1.get(8));

            //add(int index , Object e)
            diseaseNames1.add(6, "Omicron virus");
            System.out.println("Add the Disease Name by Index and Object : " + diseaseNames1);

            //addALL-addAll(int index , Collection e)
            diseaseNames1.addAll(diseaseNames);
            System.out.println("Add all the diseases names : " + diseaseNames1);


        }
    }

