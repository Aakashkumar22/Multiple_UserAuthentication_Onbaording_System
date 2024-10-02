package services;

import Interfaces.Step;
import Model.Context;

public class MobileOnboardingStep implements Step {
    private final String name = "Mobile Onboarding Step";

    @Override
    public void execute(Context context) {
        String mobileNumber = context.get("mobileNumber", String.class);
        System.out.println(name + " processing mobile onboarding for: " + mobileNumber);
        context.put("onboardingStatus", "Mobile onboarding successful");
    }

    @Override
    public String getName() {
        return name;
    }
}

