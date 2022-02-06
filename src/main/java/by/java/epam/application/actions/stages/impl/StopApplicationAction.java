package by.java.epam.application.actions.stages.impl;

import by.java.epam.application.actions.IAction;
import by.java.epam.application.exceptions.StopApplicationException;

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
