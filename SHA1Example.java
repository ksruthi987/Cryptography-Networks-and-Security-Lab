import java.security.MessageDigest;

public class SHA1Example {
    public static void main(String[] args) {
        try {
            String message = "Hello World"; // Input text

            // Create MessageDigest object for SHA-1
            MessageDigest md = MessageDigest.getInstance("SHA-1");

            // Convert message to byte array
            byte[] messageBytes = message.getBytes();

            // Compute digest
            byte[] digestBytes = md.digest(messageBytes);

            // Convert byte array to Hex format
            StringBuilder hexString = new StringBuilder();
            for (byte b : digestBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            // Output
            System.out.println("Original Message: " + message);
            System.out.println("SHA-1 Digest: " + hexString.toString());

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}