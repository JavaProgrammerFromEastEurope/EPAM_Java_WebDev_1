package by.java.epam.functions.impl;

import by.java.epam.application.utils.Init;
import by.java.epam.application.utils.Maths;
import by.java.epam.entity.Array;
import by.java.epam.functions.IFunction;
import org.apache.logging.log4j.Level;

import java.util.Arrays;

import static by.java.epam.application.utils.Init.initLineObjects;

/** Replacing array elements by condition:
 * Compress the array by throwing out every second element.
 **/
public class SecondFunction extends Array implements IFunction {

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
        // setArray(initLineObjects(true, true, (int) variables[0]));
        setArray(Init.initArrayFromFile());
        setExtraArray(Maths.changeArrayElements(getArray()));
    }

    @Override
    public void getResultString() {
        try {
            addString[0] = "2. Replacing array element by condition";
            addString[1] = "Custom array:";
            addString[2] = "Modified array:";
            logger.printf(Level.INFO,"%s%n %s%n %s%n %s%n %s%n%n", addString[0],
                    addString[1], Arrays.toString(getArray()),
                    addString[2], Arrays.toString(getExtraArray()));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}
