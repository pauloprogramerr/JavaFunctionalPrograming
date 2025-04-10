package com.funcional.codigos;

import java.util.function.Function;


public class FunctionInterfaceForFunctionComposition {

    void funcitonComposition(){
        Function<Integer, Integer> baseFunction = t -> t + 2;

        /**  If we desire to duplicate the functionality of f(x) using composition, we use the
         * Function interface's andThen method
        */
        Function<Integer, Integer> afterFunction =
                baseFunction.andThen(t -> t * 3);
        System.out.println(afterFunction.apply(5));

        /**
         *  To duplicate the functionality of g(x), we use the compose method:
         */

        Function<Integer, Integer> beforeFunction =
                baseFunction.compose(t -> t * 3);
        System.out.println(beforeFunction.apply(5));
    }
}
