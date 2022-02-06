package by.java.epam.functions.impl;

import by.java.epam.application.utils.Init;
import by.java.epam.application.utils.Maths;
import by.java.epam.entity.Array;
import by.java.epam.functions.IFunction;
import org.apache.logging.log4j.Level;

import java.util.Arrays;

import static by.java.epam.application.utils.Init.initLineObjects;

/** Determining sum of array elements **/
public class FourthFunction extends Array implements IFunction {

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
        setArray(initLineObjects(true, true, (int)variables[0]));
        operation[0] = Maths.sumOfIndexValues( getArray(), 0, getArray().length-1);
    }

    @Override
    public void getResultString() {
        try {
            addString[0] = "4. Determining sum of array elements";
            addString[1] = "Custom array:";
            addString[2] = "The Sum of array element is:";
            logger.printf(Level.INFO,"%s%n %s%n %s%n %s %s%n%n",addString[0], addString[1],
                    Arrays.toString(getArray()), addString[2], (int)operation[0]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}
