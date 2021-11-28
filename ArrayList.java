package Collections;

import java.util.*;

public class ArrayList {
    public static void main(String[] args) {
        List<String> cities = new java.util.ArrayList<>();

        // CREATE
        cities.add("Мogilev");
        cities.add("Minsk");
        cities.add("Brest");
        cities.add("Gomel");
        cities.add("Jodino");

        //READ
        System.out.println("size = " + cities.size());
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n delete Gomel - ");
       //DELETE
        cities.remove("Gomel");
        System.out.println("size = " + cities.size());
        for (String city : cities){
            System.out.println(city);
        }

        //UPDATE
        System.out.println("\n update by index 4 to Grodno - ");
        cities.set(3, "Grodno");
        System.out.println(cities);  // [Мogilev, Minsk, Brest, Grodno]

        System.out.println("-----");
        //SORT
        List<String> sortingOfCities = new java.util.ArrayList<>();
        Collections.addAll(sortingOfCities,"Мogilev","Minsk","Brest" ,"Gomel","Jodino" );
        Collections.sort(sortingOfCities);
        System.out.println("Sorting : ");
        System.out.println(sortingOfCities);   //  [Brest, Gomel, Jodino, Minsk, Мogilev]





    }

}
