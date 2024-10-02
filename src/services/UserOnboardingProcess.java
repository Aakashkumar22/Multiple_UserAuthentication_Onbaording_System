package services;

import Interfaces.Process;
import Interfaces.Step;
import Model.Context;

import java.util.ArrayList;
import java.util.List;

public class UserOnboardingProcess implements Process {
    private final List<Step> steps = new ArrayList<>();

    @Override
    public void addStep(Step step) {
        steps.add(step);
    }

    @Override
    public void execute(Context context) {
        for (Step step : steps) {
            step.execute(context);
        }
    }
}

