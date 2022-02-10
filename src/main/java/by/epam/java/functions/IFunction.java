package by.epam.java.functions;

import by.epam.java.application.utils.Input;
import by.epam.java.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static by.epam.java.application.utils.Input.getInteger;
import static java.util.Arrays.fill;

public interface IFunction {

    Logger logger = LogManager.getLogger(IFunction.class);
    CustomArray customArray = new CustomArray();

    String[] addString = new String[6];
    double[] variables = new double[3];
    double[] operation = new double[3];

    default void inputVariables(int length) throws IllegalStateException {
        switch (length) {
            case 1: case 2: case 3:
                for (int index = 0; index < length; index++) {
                    variables[index] = Input.getInteger("Input length of array:");
                }
                return;
            default:
                throw new IllegalStateException("Unexpected value: " + length);
        }
    }

    default void setDefaults() {
        fill(operation, 0);
        fill(variables, 0);
        fill(addString, null);
    }

    void calcFunction();

    void getResultString();
}