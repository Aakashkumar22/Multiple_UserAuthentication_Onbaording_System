package Factory;

import Interfaces.Step;

public interface StepFactory {
    Step createStep(String stepType);
}


