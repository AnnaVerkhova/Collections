package Collections;

import java.util.ArrayDeque;

public class DequeDemo {
    public static void main(String[] args) {

        ArrayDeque<String> cities = new ArrayDeque<>();
        cities.add("Moscow");
        cities.add("Minsk");
        cities.add("Berlin");
        cities.add("Paris");
        System.out.println(cities);  // [Moscow, Minsk, Berlin, Paris]

        cities.push("Vena");
        System.out.println(cities);  // [Vena, Moscow, Minsk, Berlin, Paris]

        cities.offer("Prague");
        System.out.println(cities);  // [Vena, Moscow, Minsk, Berlin, Paris, Prague]

        while (cities.peek() != null){
            System.out.print(cities.poll());  // Vena | Moscow | Minsk | Berlin | Paris | Prague |
            System.out.print(" | ");
        }
        System.out.println(cities);  // []
    }
}
