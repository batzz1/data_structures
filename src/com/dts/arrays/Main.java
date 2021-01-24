package com.dts.arrays;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
//
        Array numbers = new Array(3);
        numbers.insert(ThreadLocalRandom.current().nextInt(0, 100) + 1);
        numbers.insert(ThreadLocalRandom.current().nextInt(0, 100) + 1);
        numbers.insert(ThreadLocalRandom.current().nextInt(0, 100) + 1);
        numbers.insert(ThreadLocalRandom.current().nextInt(0, 100) + 1);
        numbers.insert(ThreadLocalRandom.current().nextInt(0, 100) + 1);

        numbers.print();
        System.out.println("Max is " + numbers.max());
    }
}
