package com.funcional.codigos;

import java.util.function.Function;

public class Compose {
    public interface CompositionFunction<T, R> {
         R call(T x);
    }

    public static <T, U, R> CompositionFunction<T, R> compose(
            final  CompositionFunction<T, R> f,
            final CompositionFunction<T, U> g) {
        return new CompositionFunction<T, R>() {
            @Override
            public R call(T x) {
                return f.call((T) g.call(x));
            }
        };
    }

    CompositionFunction<Double, Double> doubleNumber =
            new CompositionFunction<Double, Double>() {
                @Override
                public Double call(Double x) {
                    return 2 * x;
                }
            };
    CompositionFunction<Double, Double> negateNumber =
            new CompositionFunction<Double, Double>() {
                @Override
                public Double call(Double x) {
                    return -x;
                }
            };

    public void mains() {
        CompositionFunction<Double, Double> doubleThenNegate;
        doubleThenNegate = Compose.compose(doubleNumber, negateNumber);
        System.out.println(doubleThenNegate.call(5.0));
    }

    /**
     *  In Java 8, we can use the Function interface's compose method along with lambda
     * expressions instead to achieve the same results with a lot less effort as shown next.
     * The output will still be
     *
     */

    public void main2(){
        Function<Double, Double> doubleFunction = x -> 2 * x;
        Function<Double, Double> second =
                (x -> -x);
        System.out.println(doubleFunction.apply(second.apply(5.0)));
    }

    public static void main(String[] args) {
        Compose compose = new Compose();
        compose.mains();
        compose.main2();
    }


}
