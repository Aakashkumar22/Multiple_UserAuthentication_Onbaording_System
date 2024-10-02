package services;

import Factory.CredentialVerificationStrategyFactory;
import Interfaces.Step;
import Stragegy.CredentialVerificationStrategy;

public class DefaultStepFactory {

    // Method to create steps based on the provided stepType
    public Step createStep(String stepType, String credentialType) {
        switch (stepType) {
            case "mobileOnboarding":
                return new MobileOnboardingStep();
            case "emailOnboarding":
                return new EmailOnboardingStep();
            case "credentialVerification":
                // Use the factory to get the appropriate verification strategy
                CredentialVerificationStrategy strategy = CredentialVerificationStrategyFactory.getStrategy(credentialType);
                return new CredentialVerificationStep(strategy);
            case "accountExistenceVerification":
                return new AccountExistenceVerificationStep();
            default:
                throw new IllegalArgumentException("Unknown step type: " + stepType);
        }
    }
}



