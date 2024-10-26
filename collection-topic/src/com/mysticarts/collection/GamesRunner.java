package com.mysticarts.collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GamesRunner {

        public static void main(String[] args) {

            Collection<String> gameNames = new ArrayList();

            Collection addAllGames = new ArrayList();

            //add-boolean add(Object e)
            gameNames.add("Minecraft");
            gameNames.add("Fortnite");
            gameNames.add("Overwatch");
            gameNames.add("Apex Legends");
            gameNames.add("Call of Duty");
            gameNames.add("FIFA");
            gameNames.add("Valorant");
            gameNames.add("League of Legends");
            gameNames.add("DOTA 2");
            gameNames.add("PUBG");
            System.out.println(gameNames);

            //addAll-boolean addAll(Collection)
            addAllGames.addAll(gameNames);
            System.out.println("Add the All the GAMES: " + addAllGames);

            //size- int size()
            System.out.println("Size of game names: " + gameNames.size());

            //clear-void clear()
            gameNames.clear();
            System.out.println("After clearing te gameNames :  " + gameNames.size());

            //remove-boolean remove(Object o)
            gameNames.remove("FIFA");
            System.out.println("Game Name after removing FIFA : " + gameNames);

            //removeAll-boolean removeAll(Collection e)
            boolean removingAll = addAllGames.removeAll(gameNames);
            System.out.println("All names after removing game names: " + removingAll);

            //contains-boolean contains(Object e)
            boolean containn = gameNames.contains("Call of Duty");
            System.out.println("Is gameName contain Call of Duty :  " + containn);

            //containsAll-boolean containsAll(Collection e)
            System.out.println("Is game Names contain all:  " + addAllGames.containsAll(gameNames));

            //retainAll-boolean retainAll(Collection e)
            boolean retain = addAllGames.retainAll(gameNames);
            System.out.println("All names after retaining game names: " + retain);


            List<String> gameNames1 = new ArrayList();

            System.out.println("List the  Game Names: ");
            gameNames1.add("Minecraft");
            gameNames1.add("BGMI");
            gameNames1.add("Overwatch");
            gameNames1.add("Apex Legends");
            gameNames1.add("Call of Duty");
            gameNames1.add("FIFA");
            gameNames1.add("Valorant");
            gameNames1.add("League of Legends");
            gameNames1.add("DOTA 2");
            gameNames1.add("PUBG");
            ;
            System.out.println(gameNames1);

            //Object get(int index)
            System.out.println("GET THE GAME NAME BY INDEX : " + gameNames1.get(3));

            //add(int index , Object e)
            gameNames1.add(8, "Ninja fruit cutting");
            System.out.println("Add the Game Name by Index and Object : " + gameNames1);

            //addALL-addAll(int index , Collection e)
            gameNames1.addAll(gameNames);
            System.out.println("Add all the Game names : " + gameNames1);


        }
    }

