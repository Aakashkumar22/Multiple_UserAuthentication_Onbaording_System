package Mainclass;

import Model.Context;
import services.DefaultStepFactory;
import services.UserOnboardingProcess;

public class amain {
        public static void main(String[] args) {
            // Create a context to hold the onboarding data
            System.out.println("Onboarding using Email+Passport");
            System.out.println("\n");
            Context context4 = new Context();
            context4.put("email", "aakash22@gmail.com");
            context4.put("credential", "A1234567"); // Example PAN number
            context4.put("userId", "user789");

            // Define the credential type dynamically (in this case, PAN)
            String credentialType = "passport"; // This can be changed to "aadhaar" or any other credential

            // Create the onboarding process for email onboarding scenario
            UserOnboardingProcess onboardingProcess4 = new UserOnboardingProcess();
            onboardingProcess4.addStep(new DefaultStepFactory().createStep("emailOnboarding", null)); // Email onboarding
            onboardingProcess4.addStep(new DefaultStepFactory().createStep("credentialVerification", credentialType)); // PAN verification
            onboardingProcess4.addStep(new DefaultStepFactory().createStep("accountExistenceVerification", null)); // Account existence check

            onboardingProcess4.execute(context4);

            // Output results for Context 4

            System.out.println("Onboarding Status (Email): " + context4.get("onboardingStatus", String.class));
            System.out.println("Credential Verification Status (passport): " + context4.get("credentialVerificationStatus", String.class));
            System.out.println("Account Exists: " + context4.get("accountExists", Boolean.class));

            System.out.println("\n");




            System.out.println("Onboarding using MobileNo+Pancard");
            System.out.println("\n");
            Context context5 = new Context();
            context5.put("mobileNumber", "9341237529");
            context5.put("credential", "ABCEY4478G"); // Example PAN number
            context5.put("userId", "user180");

            // Define the credential type dynamically (in this case, PAN)
            String credentialType3 = "pan"; // This can be changed to "aadhaar" or any other credential

            // Create the onboarding process for email onboarding scenario
            UserOnboardingProcess onboardingProcess5 = new UserOnboardingProcess();
            onboardingProcess5.addStep(new DefaultStepFactory().createStep("mobileOnboarding", null)); // Email onboarding
            onboardingProcess5.addStep(new DefaultStepFactory().createStep("credentialVerification", credentialType3)); // PAN verification
            onboardingProcess5.addStep(new DefaultStepFactory().createStep("accountExistenceVerification", null)); // Account existence check

            onboardingProcess5.execute(context5);

            // Output results for Context 4
            System.out.println("Onboarding Status (Mobile): " + context5.get("onboardingStatus", String.class));
            System.out.println("Credential Verification Status (panCard): " + context5.get("credentialVerificationStatus", String.class));
            System.out.println("Account Exists: " + context5.get("accountExists", Boolean.class));

            System.out.println("\n");



            System.out.println("Onboarding using MobileNo+AadhaarNo");
            System.out.println("\n");
            Context context1 = new Context();
            context1.put("mobileNumber", "9876543210");
            context1.put("credential", "1234-5678-9012"); // Example PAN number
            context1.put("userId", "user456");

            // Define the credential type dynamically
            String credentialType2 = "aadhaar"; // This can be changed to "aadhaar" or any other credential

            // Create the onboarding process with dynamic credential verification
            UserOnboardingProcess onboardingProcess1 = new UserOnboardingProcess();
            onboardingProcess1.addStep(new DefaultStepFactory().createStep("mobileOnboarding", null));
            onboardingProcess1.addStep(new DefaultStepFactory().createStep("credentialVerification", credentialType2));
            onboardingProcess1.addStep(new DefaultStepFactory().createStep("accountExistenceVerification", null));

            onboardingProcess1.execute(context1);

            // Output results for Case 1

            System.out.println("Onboarding Status (Mobile): " + context1.get("onboardingStatus", String.class));
            System.out.println("Credential Verification Status (" + credentialType2.toUpperCase() + "): " + context1.get("credentialVerificationStatus", String.class));
            System.out.println("Account Exists: " + context1.get("accountExists", Boolean.class));

            System.out.println("\n");

            System.out.println("Onboarding using Email+AadhaarNo");
            System.out.println("\n");
            Context context2 = new Context();
            context2.put("email", "shubham34r@example.com"); // Email for onboarding
            context2.put("credential", "1234-5678-9012"); // Example Aadhaar number
            context2.put("userId", "user457"); // User ID for account existence check

            // Define the credential type dynamically (in this case, Aadhaar)
            String credentialType6 = "aadhaar"; // This can be switched to "pan" if needed

            // Create the onboarding process for email onboarding scenario
            UserOnboardingProcess onboardingProcess2 = new UserOnboardingProcess();
            onboardingProcess2.addStep(new DefaultStepFactory().createStep("emailOnboarding", null)); // Email onboarding
            onboardingProcess2.addStep(new DefaultStepFactory().createStep("credentialVerification", credentialType6)); // Aadhaar verification
            onboardingProcess2.addStep(new DefaultStepFactory().createStep("accountExistenceVerification", null)); // Account existence check

            // Execute the onboarding process
            onboardingProcess2.execute(context2);


            // Output results for Context 2
            System.out.println("Onboarding using Email+Aadhaar");
            System.out.println("Onboarding Status (Email): " + context2.get("onboardingStatus", String.class));
            System.out.println("Credential Verification Status (Aadhaar): " + context2.get("credentialVerificationStatus", String.class));
            System.out.println("Account Exists: " + context2.get("accountExists", Boolean.class));
            System.out.println("\n");



            System.out.println("Onboarding using Email+drivingLisecnceNo");
            System.out.println("\n");
            Context context6 = new Context();
            context6.put("email", "aakcu22@gmail.com");
            context6.put("credential", "DL1420110012345"); // Example PAN number
            context6.put("userId", "user690");

            // Define the credential type dynamically (in this case, PAN)
            String credentialType11 = "drivingLisecnce"; // This can be changed to "aadhaar" or any other credential

            // Create the onboarding process for email onboarding scenario
            UserOnboardingProcess onboardingProcess6= new UserOnboardingProcess();
            onboardingProcess6.addStep(new DefaultStepFactory().createStep("emailOnboarding", null)); // Email onboarding
            onboardingProcess6.addStep(new DefaultStepFactory().createStep("credentialVerification", credentialType11)); // PAN verification
            onboardingProcess6.addStep(new DefaultStepFactory().createStep("accountExistenceVerification", null)); // Account existence check

            onboardingProcess6.execute(context6);

            // Output results for Context 4

            System.out.println("Onboarding Status (Email): " + context6.get("onboardingStatus", String.class));
            System.out.println("Credential Verification Status (DrivingLisecnceNo): " + context6.get("credentialVerificationStatus", String.class));
            System.out.println("Account Exists: " + context6.get("accountExists", Boolean.class));

            System.out.println("\n");
        }
        }











