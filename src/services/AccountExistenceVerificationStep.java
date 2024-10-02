package services;

import Interfaces.Step;
import Model.Context;

public class AccountExistenceVerificationStep implements Step {
    private final String name = "Account Existence Verification Step";

    @Override
    public void execute(Context context) {
        String userId = context.get("userId", String.class);
        System.out.println(name + " checking account existence for user ID: " + userId);
        boolean exists = userId != null && !userId.isEmpty(); // Simplified existence check
        context.put("accountExists", exists);
    }

    @Override
    public String getName() {
        return name;
    }
}

