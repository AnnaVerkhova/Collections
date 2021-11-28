package Collections;

import java.util.List;

public class ObjectQueueDemo {

    public static void main(String[] args) {
        List<String> cities = new ObjectQueue<String>();
        cities.add("Minsk");
        cities.add("Мoscow");
        cities.add("London");
        cities.add("Rome");
        System.out.println(cities.get(2));  // London
    }
}
