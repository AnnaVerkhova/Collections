package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> cities = new HashMap<>();
        cities.put(1, "Minsk");
        cities.put(2, "Brest");
        cities.put(3, "Gomel");
        cities.put(4, "Vitebsk");
        cities.put(5, "Mogilev");

        System.out.println(cities.get(3));  // Gomel

        for (Map.Entry<Integer, String> entry : cities.entrySet()) {
            System.out.printf("Key %s - value %s\n", entry.getKey(), entry.getValue());
            //Key 1 - value Minsk
            //Key 2 - value Brest
            //Key 3 - value Gomel
            //Key 4 - value Vitebsk
            //Key 5 - value Mogilev
        }
        if (cities.keySet().contains(6));
        System.out.println(cities.get(6));  // null
    }
}
