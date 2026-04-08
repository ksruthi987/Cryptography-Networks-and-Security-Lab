import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class BlowfishTool {
    public static void main(String[] args) throws Exception {
        String plainText = "Hello world";

        // 1. Create a KeyGenerator for Blowfish
        KeyGenerator keyGen = KeyGenerator.getInstance("Blowfish");
        
        // 2. Generate the SecretKey
        // Note: You can specify size (e.g., keyGen.init(128)), but default is fine.
        SecretKey secretKey = keyGen.generateKey();

        // 3. Initialize the Cipher for Encryption
        Cipher cipher = Cipher.getInstance("Blowfish");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        // 4. Perform the Encryption
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());

        // 5. Convert to Base64 for a readable output
        String encryptedText = Base64.getEncoder().encodeToString(encryptedBytes);

        System.out.println("Original Text: " + plainText);
        System.out.println("Generated Key (Encoded): " + Base64.getEncoder().encodeToString(secretKey.getEncoded()));
        System.out.println("Encrypted (Blowfish): " + encryptedText);
    }
}