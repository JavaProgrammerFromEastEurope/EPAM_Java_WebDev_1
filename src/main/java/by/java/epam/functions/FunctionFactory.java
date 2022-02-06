package by.java.epam.functions;

import by.java.epam.functions.impl.*;

import java.util.HashMap;

public class FunctionFactory {

    private final HashMap<Integer, IFunction> serviceFunctions = new HashMap<>();

    private static final FunctionFactory instance = new FunctionFactory();

    private FunctionFactory(){
        serviceFunctions.put(1, new FirstFunction());
        serviceFunctions.put(2, new SecondFunction());
        serviceFunctions.put(3, new ThirdFunction());
        serviceFunctions.put(4, new FourthFunction());
        serviceFunctions.put(5, new FifthFunction());
    }

    public HashMap<Integer, IFunction> getServiceFunctions() {
        return serviceFunctions;
    }

    public static FunctionFactory getInstance() {
        return instance;
    }
}
