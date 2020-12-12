package Advanced.Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> pokemons = new PriorityQueue<>();

        pokemons.add("Charmander");
        pokemons.offer("Pikachu");   // same as .add

        System.out.println(pokemons.peek());
        pokemons.poll();
        System.out.println(pokemons.peek());

    }
}
