package Stragegy;


public class PassportVerificationStrategy implements CredentialVerificationStrategy {
    @Override
    public boolean verify(String credential) {
        // Simplified passport verification logic
        // You can replace this with actual validation logic or API call
        if (credential != null && credential.matches("[A-Z]{1}[0-9]{7}")) {
            System.out.println("Passport verified successfully: " + credential);
            return true;
        } else {
            System.out.println("Invalid passport number: " + credential);
            return false;
        }
    }
}

