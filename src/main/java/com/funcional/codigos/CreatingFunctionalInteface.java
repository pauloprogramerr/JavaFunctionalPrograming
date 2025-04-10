package com.funcional.codigos;

public class CreatingFunctionalInteface {

    @FunctionalInterface
    public interface IntegerConcatenation<T> {
        public String integerConcatenate(Integer u, Integer v);
    }
}
