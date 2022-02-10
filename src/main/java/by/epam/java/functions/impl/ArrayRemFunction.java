package by.epam.java.functions.impl;

import by.epam.java.application.utils.Maths;
import by.epam.java.functions.IFunction;
import org.apache.logging.log4j.Level;

import java.util.Arrays;

import static by.epam.java.application.utils.Init.initLineObjects;

/**
 * Replacing array elements by condition:
 * Compress the array by throwing out every second element.
 **/
public class ArrayRemFunction implements IFunction {

    @Override
    public void inputVariables(int length) {
        try {
            IFunction.super.inputVariables(length);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void calcFunction() {
        customArray.setArray(initLineObjects(true, true, (int) variables[0]));
        customArray.setExtraArray(Maths.changeArrayElements(customArray.getArray()));
    }

    @Override
    public void getResultString() {
        try {
            addString[0] = "2. Replacing array element by condition";
            addString[1] = "Custom array:";
            addString[2] = "Modified array:";
            logger.printf(Level.INFO, "%s%n %s%n %s%n %s%n %s%n%n", addString[0],
                    addString[1], Arrays.toString(customArray.getArray()),
                    addString[2], Arrays.toString(customArray.getExtraArray()));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}
