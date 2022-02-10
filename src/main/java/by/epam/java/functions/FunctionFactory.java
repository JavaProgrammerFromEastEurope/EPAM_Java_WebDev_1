package by.epam.java.functions;

import by.epam.java.functions.impl.*;

import java.util.HashMap;

public class FunctionFactory {

    private final HashMap<Integer, IFunction> serviceFunctions = new HashMap<>();

    private static final FunctionFactory instance = new FunctionFactory();

    private FunctionFactory(){
        serviceFunctions.put(1, new ArraySortFunction());
        serviceFunctions.put(2, new ArrayRemFunction());
        serviceFunctions.put(3, new ArrayAverFunction());
        serviceFunctions.put(4, new ArraySumFunction());
        serviceFunctions.put(5, new ArrayCountFunction());
    }

    public HashMap<Integer, IFunction> getServiceFunctions() {
        return serviceFunctions;
    }

    public static FunctionFactory getInstance() {
        return instance;
    }
}
