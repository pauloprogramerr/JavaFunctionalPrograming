package com.funcional.codigos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateTypeFunctionInterface {
    public static void main(String[] args) {
        Predicate<Integer> tooLarge = s -> s > 100;
        System.out.println(tooLarge.test(45));

        List<Integer> list = Arrays.asList(230, 45, 13, 563, 4);
        Stream<Integer> stream = list.stream();
        stream.forEach(s -> System.out.println(tooLarge.test(s)));
    }
}
