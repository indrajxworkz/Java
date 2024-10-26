package com.mysticarts.collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class BrandsRunner {

        public static void main(String[] args) {

            Collection<String> clothBrandNames = new ArrayList();

            Collection addAllBrands = new ArrayList();

            //add-boolean add(Object e)
            clothBrandNames.add("Nike");
            clothBrandNames.add("Adidas");
            clothBrandNames.add("Puma");
            clothBrandNames.add("Under Armour");
            clothBrandNames.add("Reebok");
            clothBrandNames.add("New Balance");
            clothBrandNames.add("Levi's");
            clothBrandNames.add("Zara");
            clothBrandNames.add("Gucci");
            clothBrandNames.add("Prada");
            System.out.println(clothBrandNames);

            //addAll-boolean addAll(Collection)
            addAllBrands.addAll(clothBrandNames);
            System.out.println("Add the All the Cloth BrandName: " + addAllBrands);

            //size- int size()
            System.out.println("Size of cloth brand names: " + clothBrandNames.size());

            //clear-void clear()
            clothBrandNames.clear();
            System.out.println("After clearing te brandNames :  " + clothBrandNames.size());

            //remove-boolean remove(Object o)
            clothBrandNames.remove("Puma");
            System.out.println("Cloth Brand Name after removing PUMA : " + clothBrandNames);

            //removeAll-boolean removeAll(Collection e)
            boolean removingAll =  addAllBrands.removeAll(clothBrandNames);
            System.out.println("All names after removing cloth brand names: " + removingAll);

            //contains-boolean contains(Object e)
            boolean containn = clothBrandNames.contains("Nike");
            System.out.println("Is clothBrandNames contain Nike :  " + containn);

            //containsAll-boolean containsAll(Collection e)
            System.out.println("Is clothBrandNames contain all:  " + addAllBrands.containsAll(clothBrandNames));

            //retainAll-boolean retainAll(Collection e)
            boolean retain = addAllBrands.retainAll(clothBrandNames);
            System.out.println("All names after retaining Cloth brand names: " + retain);


            List<String> clothBrandNames1 = new ArrayList();

            System.out.println("List the  Cloth brand Names: ");
            clothBrandNames1.add("Nike");
            clothBrandNames1.add("Adidas");
            clothBrandNames1.add("Puma");
            clothBrandNames1.add("Under Armour");
            clothBrandNames1.add("Reebok");
            clothBrandNames1.add("New Balance");
            clothBrandNames1.add("Levi's");
            clothBrandNames1.add("Zara");
            clothBrandNames1.add("Gucci");
            clothBrandNames1.add("Prada");
            System.out.println(clothBrandNames1);

            //Object get(int index)
            System.out.println("GET THE CLOTH BRAND NAME BY INDEX : " + clothBrandNames1.get(5));

            //add(int index , Object e)
            clothBrandNames1.add(9,"Tulip");
            System.out.println("Add the Cloth Brand Name by Index and Object : " + clothBrandNames1);

            //addALL-addAll(int index , Collection e)
            clothBrandNames1.addAll(clothBrandNames);
            System.out.println("Add all the cloth brand names : " + clothBrandNames1);



        }
    }

