package Stragegy;


public class DrivingLicenseVerificationStrategy implements CredentialVerificationStrategy {
    @Override
    public boolean verify(String credential) {
        // Simplified driving license verification logic
        // You can replace this with actual validation logic or API call
        if (credential != null && credential.matches("[A-Z]{2}[0-9]{13}")) {
            System.out.println("Driving License verified successfully: " + credential);
            return true;
        } else {
            System.out.println("Invalid driving license number: " + credential);
            return false;
        }
    }
}

