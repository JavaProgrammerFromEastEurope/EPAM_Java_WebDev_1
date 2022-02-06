package by.java.epam.application.actions.stages.impl;

import by.java.epam.application.actions.IAction;
import by.java.epam.application.actions.stages.BaseStageAction;

public class ThirdStageAction extends BaseStageAction implements IAction {

    @Override
    public String description() {
        return "Determining the average value of array elements.\n";
    }

    @Override
    public void action() {
        serviceActions.calcThirdFunction();
    }
}
