package com.funcional.codigos;


import java.util.IllegalFormatException;

public class ExceptionHandlingLambdaExpression {

    public interface Integerconcatenation {
        public String concatenate(Integer u, Integer v)
                throws IllegalFormatException;
    }

    public static void main(String[] args) {
        Integerconcatenation ic = (m, n) -> {
            if (m == 0) {
                throw new IllegalArgumentException("m cannot be 0");
            }else {
                return m + ":" + n;
            }
        };
        System.out.println(
                ic.concatenate(0, 23));
    }
}
