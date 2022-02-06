package by.java.epam.functions.impl;

import by.java.epam.application.utils.Init;
import by.java.epam.application.utils.Sort;
import by.java.epam.functions.IFunction;
import by.java.epam.entity.CustomArray;
import org.apache.logging.log4j.Level;

import java.util.Arrays;


/** Finding min/max of array **/
public class FirstFunction extends CustomArray implements IFunction {

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
         setExtraArray(Init.initArrayFromFile());
         // setExtraArray(initLineObjects(true, true, (int)variables[0]));
        setArray(Sort.sortHoare(getExtraArray().clone(), 0, getExtraArray().length-1));
    }

    @Override
    public void getResultString() {
        try {
            addString[0] = "1. Finding min/max values of array";
            addString[1] = "Custom array - Sort of Hoare:";
            addString[2] = "Max value is:";
            addString[3] = "Min value is:";
            addString[4] = getArray()[getArray().length - 1].toString();
            addString[5] = getArray()[0].toString();
            logger.printf(Level.INFO,"%s%n %s%n %s%n %s%n %s %s%n %s %s%n%n",addString[0], addString[1],
                    Arrays.toString(getExtraArray()), Arrays.toString(getArray()), addString[3],
                            addString[5],addString[2], addString[4]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}
