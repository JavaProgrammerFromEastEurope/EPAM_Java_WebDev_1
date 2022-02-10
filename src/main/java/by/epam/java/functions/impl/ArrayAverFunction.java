package by.epam.java.functions.impl;

import by.epam.java.application.utils.Maths;
import by.epam.java.functions.IFunction;
import org.apache.logging.log4j.Level;

import java.util.Arrays;

import static by.epam.java.application.utils.Init.initLineObjects;

/** Determining the average value of array elements **/
public class ArrayAverFunction implements IFunction {

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
        customArray.setArray(initLineObjects(true, true, (int)variables[0]));
        operation[0] = Maths.getAverageScore(customArray.getArray());
    }

    @Override
    public void getResultString() {
        try {
            addString[0] = "3. Determining the average value of array elements";
            addString[1] = "Custom array:";
            addString[2] = "The Average score:";
            logger.printf(Level.INFO,"%s%n %s%n %s%n %s %.1f%n%n",addString[0], addString[1],
                     Arrays.toString(customArray.getArray()), addString[2], operation[0]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}
