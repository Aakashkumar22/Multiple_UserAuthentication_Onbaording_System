package services;

import Interfaces.Step;
import Model.Context;
import Stragegy.CredentialVerificationStrategy;

public class CredentialVerificationStep implements Step {
    private final String name = "Credential Verification Step";
    private CredentialVerificationStrategy strategy;

    public CredentialVerificationStep(CredentialVerificationStrategy strategy) {
        this.strategy=strategy;
    }

    @Override
    public void execute(Context context) {
        String credential = context.get("credential", String.class);
        boolean isVerified = strategy.verify(credential);
        context.put("credentialVerificationStatus", isVerified ? "Verification successful" : "Verification failed");
    }

    @Override
    public String getName() {
        return name;
    }
}

