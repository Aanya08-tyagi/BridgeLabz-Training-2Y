import java.util.Arrays;

public class OTPGenerator {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000); // Range: 100000–999999
    }

    // Method to generate an array of 10 OTPs
    public static int[] generateOTPArray(int size) {
        int[] otps = new int[size];
        for (int i = 0; i < size; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    // Method to check if all OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true;
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        int[] otpArray = generateOTPArray(10);

        System.out.println("Generated OTPs: " + Arrays.toString(otpArray));

        boolean unique = areOTPsUnique(otpArray);
        System.out.println("Are all OTPs unique? " + (unique ? "Yes ✅" : "No ❌"));
    }
}