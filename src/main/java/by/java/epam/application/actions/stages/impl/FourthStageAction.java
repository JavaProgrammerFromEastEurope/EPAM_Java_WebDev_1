package by.java.epam.application.actions.stages.impl;

import by.java.epam.application.actions.IAction;
import by.java.epam.application.actions.stages.BaseStageAction;

public class FourthStageAction extends BaseStageAction implements IAction {

    @Override
    public String description() {
        return "Determining sum of array elements.\n";
    }

    @Override
    public void action() {
        serviceActions.calcFourthFunction();
    }
}
