package Stragegy;


public class PanVerificationStrategy implements CredentialVerificationStrategy {

    @Override
    public boolean verify(String pan) {
        System.out.println("Verifying PAN: " + pan);
        // Dummy validation logic (real logic would involve API calls, etc.)
        return pan != null && pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
    }
}

