package by.epam.java.application.actions.stages.impl;

import by.epam.java.application.exceptions.StopApplicationException;
import by.epam.java.application.actions.IAction;

public class StopApplicationAction implements IAction {

    @Override
    public String description() {
        return "Exit From Application\n";
    }

    @Override
    public void action() throws StopApplicationException {
        throw new StopApplicationException();
    }
}
