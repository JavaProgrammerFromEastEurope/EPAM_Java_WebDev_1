package by.java.epam.application;

import by.java.epam.application.actions.IAction;
import by.java.epam.application.actions.stages.StageActionFactory;
import by.java.epam.application.exceptions.StopApplicationException;
import by.java.epam.application.exceptions.WrongStageException;
import by.java.epam.application.utils.Input;

import static java.lang.System.out;

public class Application {

    static final StageActionFactory stageFactory
                    = StageActionFactory.getInstance();

    public static void startEntertainment() {
        out.println("Welcome! Entertainment has become!");
        actionStages();
    }

    private static void actionStages() {
        while (true) try {
            getActionStage().action();
        } catch (StopApplicationException e) {
            break;
        }
    }

    private static IAction getActionStage() {
        stageFactory.showStageMenu();
        int index = Input.anyIntInitialize();
        try {
            return stageFactory.getActionStage(index);
        } catch (WrongStageException e) {
            out.println(e.getMessage());
        }
        return getActionStage();
    }
}
