package by.java.epam.functions.impl;

import by.java.epam.application.utils.Init;
import by.java.epam.application.utils.Maths;
import by.java.epam.entity.CustomArray;
import by.java.epam.functions.IFunction;
import org.apache.logging.log4j.Level;

import java.util.Arrays;

/** Determining the average value of array elements **/
public class ThirdFunction extends CustomArray implements IFunction {

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
        // setArray(initLineObjects(true, true, (int)variables[0]));
        setArray(Init.initArrayFromFile());
        operation[0] = Maths.getAverageScore(getArray());
    }

    @Override
    public void getResultString() {
        try {
            addString[0] = "3. Determining the average value of array elements";
            addString[1] = "Custom array:";
            addString[2] = "The Average score:";
            logger.printf(Level.INFO,"%s%n %s%n %s%n %s %.1f%n%n",addString[0], addString[1],
                     Arrays.toString(getArray()), addString[2], operation[0]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}
