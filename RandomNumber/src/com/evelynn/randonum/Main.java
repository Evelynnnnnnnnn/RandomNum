package com.evelynn.randonum;
import java.util.Random;

public class Main {
    static Random rand = new Random();
    private static int i = rand.nextInt(1000);

    public static void main(String[] args) {
        System.out.println("Random Number Generator");
        System.out.println("Num: " + i);
    }
}
