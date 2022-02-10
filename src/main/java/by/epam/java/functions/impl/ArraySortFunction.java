package by.epam.java.functions.impl;

import by.epam.java.application.utils.Sort;
import by.epam.java.functions.IFunction;
import org.apache.logging.log4j.Level;

import java.util.Arrays;

import static by.epam.java.application.utils.Init.initLineObjects;

/** Finding min/max of array **/
public class ArraySortFunction implements IFunction {

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
        customArray.setExtraArray(initLineObjects(true, true, (int)variables[0]));
        customArray.setArray(Sort.sortHoare
                (customArray.getExtraArray().clone(), 0, customArray.getExtraArray().length-1));
    }

    @Override
    public void getResultString() {
        try {
            addString[0] = "1. Finding min/max values of array";
            addString[1] = "Custom array - Sort of Hoare:";
            addString[2] = "Max value is:";
            addString[3] = "Min value is:";
            addString[4] = customArray.getArray()[customArray.getArray().length - 1].toString();
            addString[5] = customArray.getArray()[0].toString();
            logger.printf(Level.INFO,"%s%n %s%n %s%n %s%n %s %s%n %s %s%n%n",addString[0], addString[1],
                    Arrays.toString(customArray.getExtraArray()),
                    Arrays.toString(customArray.getArray()),
                        addString[3], addString[5],addString[2], addString[4]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}
