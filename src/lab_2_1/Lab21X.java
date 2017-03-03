package lab_2_1;

import lab_2_1.Computer;

/**
 *
 * Write a program to create array of Computer objects (5 pcs.).
 * Declare array of Computer objects (5 pcs.),
 * create 5 Computer objects and place it to array (using loop).
 *
 * Created by olegpoberezhets on 28.01.17.
 */
public class Lab21X {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer("Mac", 231312 + i, 4, 2, 2000);
            computers[i].setPrice(100 + 100 * computers[i].getQuantityCPU());
        }
        for (Computer computer : computers) {
            computer.viewCompute();
        }
        System.out.println();

        for (Computer computer : computers) {
                computer.setPrice(computer.getPrice() * 1.1F);
                computer.viewCompute();
 //               System.out.println(computer.getPrice() + " CPU amount " + computer.getQuantityCPU());
        }



    }
}
