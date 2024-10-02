package services;

import Interfaces.Step;
import Model.Context;

public class EmailOnboardingStep implements Step {
    private final String name = "Email Onboarding Step";

    @Override
    public void execute(Context context) {
        String email = context.get("email", String.class);
        System.out.println(name + " processing email onboarding for: " + email);
        context.put("onboardingStatus", "Email onboarding successful");
    }

    @Override
    public String getName() {
        return name;
    }
}

