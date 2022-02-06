package by.java.epam.application.actions;

import by.java.epam.application.exceptions.StopApplicationException;

public interface IAction {

    String description();

    void action() throws StopApplicationException;
}
