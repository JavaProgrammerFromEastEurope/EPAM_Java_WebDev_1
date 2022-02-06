package by.java.epam.controller.impl;

import by.java.epam.functions.FunctionFactory;
import by.java.epam.functions.IFunction;
import by.java.epam.controller.IFunctionController;

import java.util.HashMap;

public class ServiceController implements IFunctionController {

    private final HashMap<Integer, IFunction> serviceFunctions;

    public ServiceController() {
        serviceFunctions = FunctionFactory.getInstance().getServiceFunctions();
    }

    @Override
    public void calcFirstFunction() {
     /* serviceFunctions.get(1).inputVariables(1); */
        serviceFunctions.get(1).calcFunction();
        serviceFunctions.get(1).getResultString();
    }

    @Override
    public void calcSecondFunction() {
     /* serviceFunctions.get(2).inputVariables(1); */
        serviceFunctions.get(2).calcFunction();
        serviceFunctions.get(2).getResultString();
    }

    @Override
    public void calcThirdFunction() {
     /* serviceFunctions.get(3).inputVariables(1); */
        serviceFunctions.get(3).calcFunction();
        serviceFunctions.get(3).getResultString();
    }

    public void calcFourthFunction() {
        serviceFunctions.get(4).inputVariables(1);
        serviceFunctions.get(4).calcFunction();
        serviceFunctions.get(4).getResultString();
    }

    public void calcFifthFunction() {
        serviceFunctions.get(5).inputVariables(1);
        serviceFunctions.get(5).calcFunction();
        serviceFunctions.get(5).getResultString();
    }
}