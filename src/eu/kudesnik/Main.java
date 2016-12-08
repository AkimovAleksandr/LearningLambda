package eu.kudesnik;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Function<Integer,Integer> myfunc2 = x-> x*2;
        Function<Integer,Integer> myfunc3 = x-> x*3;


        int a = act(2, myfunc2);
        int b = act(2, myfunc3);



    }

    public static int act(int x, Function<Integer,Integer> func)
    {
        return func.apply(x);
    }
}
