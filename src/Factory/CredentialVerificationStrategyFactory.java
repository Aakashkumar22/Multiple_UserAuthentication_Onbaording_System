package Factory;


import Stragegy.*;

public class CredentialVerificationStrategyFactory {

    // Factory method to return appropriate strategy based on credentialType
    public static CredentialVerificationStrategy getStrategy(String credentialType) {
        if ("aadhaar".equalsIgnoreCase(credentialType)) {
            return new AadhaarVerificationStrategy();
        } else if ("pan".equalsIgnoreCase(credentialType)) {
            return new PanVerificationStrategy();
        }
        else if ("passport".equalsIgnoreCase(credentialType)) {
            return new PassportVerificationStrategy();
        }
        else if ("drivingLisecnce".equalsIgnoreCase(credentialType)) {
            return new DrivingLicenseVerificationStrategy();
        }else {
            throw new IllegalArgumentException("Unknown credential type: " + credentialType);
        }
    }
}

