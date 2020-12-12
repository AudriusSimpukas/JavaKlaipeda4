package Advanced.Inheritance.AnimalExample;

import lt.klaipeda.antrapaskaita.Array;

import java.util.Arrays;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {

        Cat cat = new Cat(true, "miau", "grey");
        Dog dog = new Dog(true, "whaf", "Doberman");

        System.out.println(cat.yeldVoice());
        System.out.println(dog.yeldVoice());

        List<Animal> animals = Arrays.asList(
                cat,
                dog,
                new Dog(true, "whafffff", "Shepard"),
                new Cat(true, "miauuuuuu", "Ginger")
        );

        for (Animal animal: animals) {
            System.out.println(animal.getClass().getSimpleName());
            System.out.println(animal.yeldVoice());
        }
    }
}
