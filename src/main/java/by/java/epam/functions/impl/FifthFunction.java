package by.java.epam.functions.impl;

import by.java.epam.application.utils.Init;
import by.java.epam.application.utils.Maths;
import by.java.epam.entity.Array;
import by.java.epam.functions.IFunction;
import org.apache.logging.log4j.Level;

import java.util.Arrays;

import static by.java.epam.application.utils.Init.initLineObjects;

/** Determination the number of positive/negative array elements **/
public class FifthFunction extends Array implements IFunction {

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
        setArray(initLineObjects(true, false, (int)variables[0]));
        operation[0] = Maths.countByTypeValues(getArray(), true, 0, getArray().length-1);
        operation[1] = Maths.countByTypeValues(getArray(), false, 0, getArray().length-1);
    }

    @Override
    public void getResultString() {
        try {
            addString[0] = "5. Determination the number of positive/negative array elements.";
            addString[1] = "Custom array:";
            addString[2] = "The Number of positive array elements:";
            addString[3] = "The Number of negative array elements:";
            logger.printf(Level.INFO,"%s%n %s%n %s%n %s %s%n %s %s%n%n",addString[0], addString[1],
                        Arrays.toString(getArray()), addString[2], (int)operation[0],
                            addString[3], (int)operation[1]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}
