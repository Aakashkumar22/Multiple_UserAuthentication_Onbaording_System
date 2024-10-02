package Interfaces;

import Model.Context;

public interface Process {
    void addStep(Step step);
    void execute(Context context);
}

