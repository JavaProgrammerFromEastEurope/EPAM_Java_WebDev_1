package by.epam.java.functions.impl;

import by.epam.java.application.utils.Init;
import by.epam.java.application.utils.Maths;
import by.epam.java.functions.IFunction;
import org.apache.logging.log4j.Level;

import java.util.Arrays;

/** Determining sum of array elements **/
public class ArraySumFunction implements IFunction {

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
        customArray.setArray(Init.initLineObjects(true, true, (int)variables[0]));
        operation[0] = Maths.sumOfIndexValues
                (customArray.getArray(), 0, customArray.getArray().length-1);
    }

    @Override
    public void getResultString() {
        try {
            addString[0] = "4. Determining sum of array elements";
            addString[1] = "Custom array:";
            addString[2] = "The Sum of array element is:";
            logger.printf(Level.INFO,"%s%n %s%n %s%n %s %s%n%n",addString[0], addString[1],
                    Arrays.toString(customArray.getArray()), addString[2], (int)operation[0]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}
