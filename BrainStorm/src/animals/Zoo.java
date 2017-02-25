package animals;

import java.util.Arrays;
import animals.mammals.Elephant;


/**
 * Created by olegpoberezhets on 12.02.17.
 */

public class Zoo {


    public static void main(String[] args) {

        Animal[] animals = new Animal[0];

        animals = addAnimalToTheZoo(animals, new Animal());
        animals = addAnimalToTheZoo(animals, new Animal());
        animals = addAnimalToTheZoo(animals, new Elephant());


        feedAllAnimals(animals);
        System.out.println("Total Animals: " + Animal.getAnimalsCount());

    }

    public static Animal[] addAnimalToTheZoo(Animal[] animals, Animal newAnimal) {
        Animal[] newAnimalsArray = Arrays.copyOf(animals, animals.length + 1);
        newAnimalsArray[newAnimalsArray.length - 1] = newAnimal;
        return newAnimalsArray;
    }


    public static void feedAllAnimals(Animal[] animals) {
        System.out.println("========");
        for (Animal animal : animals) {
            animal.feed();
        }
    }
}


