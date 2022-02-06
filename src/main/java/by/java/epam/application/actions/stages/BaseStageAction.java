package by.java.epam.application.actions.stages;

import by.java.epam.controller.impl.ServiceController;

public abstract class BaseStageAction {

    public final ServiceController serviceActions;

    public BaseStageAction() {
        this.serviceActions = new ServiceController();
    }
}
