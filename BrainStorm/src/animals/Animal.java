package animals;

/**
 * Created by olegpoberezhets on 12.02.17.
 */

public class Animal {

    private static Animal[] animals = new Animal[1];
    private String food = "food";

    private static int animalsCount;
    private int animalID;

    public Animal(){
        animalsCount++;
        this.animalID = animalsCount;
    }
    public Animal(int n){

        }

    public void feed()
    {
        System.out.println(getClass().getSimpleName() + animalID + " eats " + food);
    }
    public static int getAnimalsCount() {
        return animalsCount;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }
}
