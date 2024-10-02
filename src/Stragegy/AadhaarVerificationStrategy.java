package Stragegy;


public class AadhaarVerificationStrategy implements CredentialVerificationStrategy {

    @Override
    public boolean verify(String aadhaar) {
        System.out.println("Verifying Aadhaar: " + aadhaar);
        // Dummy validation logic (real logic would involve API calls, etc.)
        return aadhaar != null && aadhaar.matches("\\d{4}-\\d{4}-\\d{4}");
    }
}

