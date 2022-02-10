package by.epam.java.functions.impl;

import by.epam.java.application.utils.Init;
import by.epam.java.application.utils.Maths;
import by.epam.java.functions.IFunction;
import org.apache.logging.log4j.Level;

import java.util.Arrays;

/** Determination the number of positive/negative array elements **/
public class ArrayCountFunction implements IFunction {

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
        customArray.setArray(Init.initLineObjects(true, false, (int)variables[0]));
        operation[0] = Maths.countByTypeValues
                (customArray.getArray(), true, 0, customArray.getArray().length-1);
        operation[1] = Maths.countByTypeValues
                (customArray.getArray(), false, 0,customArray.getArray().length-1);
    }

    @Override
    public void getResultString() {
        try {
            addString[0] = "5. Determination the number of positive/negative array elements.";
            addString[1] = "Custom array:";
            addString[2] = "The Number of positive array elements:";
            addString[3] = "The Number of negative array elements:";
            logger.printf(Level.INFO,"%s%n %s%n %s%n %s %s%n %s %s%n%n",addString[0], addString[1],
                        Arrays.toString(customArray.getArray()), addString[2], (int)operation[0],
                            addString[3], (int)operation[1]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}
