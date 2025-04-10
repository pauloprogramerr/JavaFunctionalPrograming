package com.funcional.codigos;

public class TypeInference { //pag 66

    public interface Concatenation<T> {
        public String concatenate(T u, T v);
    }
    //Lambda expressions are assigned to an instance of this interface as shown next:


    public static void main(String[] args) {
        Concatenation<String> stringConcatenation = (s, t) ->
                s + ":" + t;
        Concatenation<Integer>integerConcatenation = (s, t) ->
                s + ":" + t;
        Concatenation<Double> doubleConcatenation = (s, t) ->
                s + ":" + t;

        System.out.println(
                stringConcatenation.concatenate("Car ", "Dog"));
        System.out.println(integerConcatenation.concatenate(23, 45));
        System.out.println(doubleConcatenation.concatenate(23.0, 45.0));
    }

}

