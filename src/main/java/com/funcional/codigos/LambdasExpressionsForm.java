package com.funcional.codigos;

public class LambdasExpressionsForm {

    public void formExpression() {

        /** the simplest form of a lambda expression
         x -> x + 1;

         The parameters can be enclosed in parentheses
             (x) -> x + 1;

         A date type can be declared for the parameters
             (int x) -> x + 1;


        multilne function which is verbose
            x -> {
                 x + 1;
                 return x;
             }
        A multiline function which uses a local variable
            x -> {
                Integer y;
                y = x + 1;
                return y;
            }

        multiples parameters must be placed in parentheses
             (x, y) -> x + y;

        Date types can be declared
                (int x, int y) -> x + y;

        the parameter's date type can be different
                (int x, String y) -> x + y;
        A return value is not required
           (x, y) -> System.out.println(x + y);

        the return type can be declared
                (int x, int y) -> {
                    return x + y;
                }
        */

//
        
    }
}
