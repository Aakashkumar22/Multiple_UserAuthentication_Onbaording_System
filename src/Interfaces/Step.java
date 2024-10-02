package Interfaces;

import Model.Context;

public interface Step {
    void execute(Context context);
    String getName();
}

