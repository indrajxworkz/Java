package com.mysticarts.collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



public class PoetsRunner {
        public static void main(String[] args) {

            Collection<String> poetWriterNames = new ArrayList();

            Collection addAllPoets = new ArrayList();

            //add-boolean add(Object e)
            poetWriterNames.add("William Wordsworth");
            poetWriterNames.add("Emily Dickinson");
            poetWriterNames.add("Pablo Neruda");
            poetWriterNames.add("Robert Frost");
            poetWriterNames.add("Sylvia Plath");
            poetWriterNames.add("Maya Angelou");
            poetWriterNames.add("Langston Hughes");
            poetWriterNames.add("T.S. Eliot");
            poetWriterNames.add("Walt Whitman");
            poetWriterNames.add("John Keats");
            System.out.println(poetWriterNames);

            //addAll-boolean addAll(Collection)
            addAllPoets.addAll(poetWriterNames);
            System.out.println("Add the All the Poet/Writer names: " + addAllPoets);

            //size- int size()
            System.out.println("Size of Poet/Writer names: " + poetWriterNames.size());

            //clear-void clear()
            poetWriterNames.clear();
            System.out.println("After clearing the Poet/Writer names :  " + poetWriterNames.size());

            //remove-boolean remove(Object o)
            poetWriterNames.remove("Robert Frost");
            System.out.println("Poet/Writer names after removing Robert Frost : " + poetWriterNames);

            //removeAll-boolean removeAll(Collection e)
            boolean removingAll = addAllPoets.removeAll(poetWriterNames);
            System.out.println("All names after removing Poet/Writer names: " + removingAll);

            //contains-boolean contains(Object e)
            boolean containn = poetWriterNames.contains("William Wordsworth");
            System.out.println("Is Poet/Writer names contain William Wordsworth :  " + containn);

            //containsAll-boolean containsAll(Collection e)
            System.out.println("Is Poet/Writer Names contain all:  " + addAllPoets.containsAll(poetWriterNames));

            //retainAll-boolean retainAll(Collection e)
            boolean retain = addAllPoets.retainAll(poetWriterNames);
            System.out.println("All names after retaining Poet/Writer names: " + retain);


            List<String> poetWriterNames1 = new ArrayList();

            System.out.println("List the  Poet/Writer Names: ");
            poetWriterNames1.add("William Wordsworth");
            poetWriterNames1.add("Emily Dickinson");
            poetWriterNames1.add("Pablo Neruda");
            poetWriterNames1.add("Robert Frost");
            poetWriterNames1.add("Sylvia Plath");
            poetWriterNames1.add("Maya Angelou");
            poetWriterNames1.add("Langston Hughes");
            poetWriterNames1.add("T.S. Eliot");
            poetWriterNames1.add("Walt Whitman");
            poetWriterNames1.add("John Keats");
            System.out.println(poetWriterNames1);

            //Object get(int index)
            System.out.println("GET THE Poet/Writer NAME BY INDEX : " + poetWriterNames1.get(2));

            //add(int index , Object e)
            poetWriterNames1.add(5, "Oscar Wilde");
            System.out.println("Add the Poet/Writer Name by Index and Object : " + poetWriterNames1);

            //addALL-addAll(int index , Collection e)
            poetWriterNames1.addAll(poetWriterNames);
            System.out.println("Add all the Poet/Writer names : " + poetWriterNames1);


        }
    }

