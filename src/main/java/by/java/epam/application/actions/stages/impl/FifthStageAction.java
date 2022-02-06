package by.java.epam.application.actions.stages.impl;

import by.java.epam.application.actions.IAction;
import by.java.epam.application.actions.stages.BaseStageAction;

public class FifthStageAction extends BaseStageAction implements IAction {

    @Override
    public String description() {
        return "Determination the number of positive/negative array elements.\n";
    }

    @Override
    public void action() {
        serviceActions.calcFifthFunction();
    }
}
