package com.funcional.codigos;

/**
 * @author pcgomes
 */

public class CreatingFunctionalInteface {

    @FunctionalInterface
    public interface IntegerConcatenation<T> {
        public String integerConcatenate(Integer u, Integer v);
    }
}
