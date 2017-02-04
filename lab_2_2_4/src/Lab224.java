/**
 *
 * Create class Person with fields firstName(String), lastName(String), age(int), gender(String), phoneNumber(int),
 * and five overloaded methods
 * that set this fields with different arguments list.
 *
 * Create class that will be use instance of class Person and his methods.
 *
 * Created by olegpoberezhets on 02.02.17.
 */

public class Lab224 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();


        person1.setPerson("Olivia");
        person2.setPerson("Jon", "Lil");
        person3.setPerson("Emma", "Watson", 27);
        person4.setPerson( "Bruce" , "Willis", 61, "man" );
        person5.setPerson("Bruce" , "Willis", 61, "man", 223_32_32);

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println(person4.toString());
        System.out.println(person5.toString());
    }
}
