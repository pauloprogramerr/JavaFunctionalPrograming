package com.funcional.codigos;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierTypeFunctionInterface {

    /**
     Supplier interface to generate a random number between 0 and 9
     excluding the numbers, 5, 6, 7, and 8
     pag 72
     */
    public void generateRandomNumber() {
        Supplier<Integer> randonIntegers = () -> {
            Random random = new Random();
            int number = random.nextInt(10);
            while (number >= 5 && number <=8 ){
                number = random.nextInt(10);
            }
            return number;
        };
        for (int i = 0; i < 10; i++) {
            System.out.print(randonIntegers.get() + " ");
        }
        System.out.println();
    }
}
