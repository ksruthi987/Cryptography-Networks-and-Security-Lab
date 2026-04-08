import java.util.Scanner;
public class HillCipher
{
	public static void main(String[] args)
{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = sc.next().toUpperCase();

        if (text.length() % 2 != 0)
            text += "X";
	String enc="";
	String dec="";
	for(int i=0;i<text.length();i+=2)
	{
		int a = text.charAt(i) - 'A';
            	int b = text.charAt(i + 1) - 'A';

           	 enc = enc + (char) ((a + 2 * b) % 26 + 'A');
            	enc = enc + (char) ((3 * a + 5 * b) % 26 + 'A');
        }

    
        for (int i = 0; i < enc.length(); i += 2) {
            	int a = enc.charAt(i) - 'A';
            	int b = enc.charAt(i + 1) - 'A';

           	 dec = dec + (char) ((21 * a + 2 * b) % 26 + 'A');
            	dec = dec +  (char) ((3 * a + 25 * b) % 26 + 'A');
        }

        	System.out.println("Encrypted: " + enc);
        	System.out.println("Decrypted: " + dec);
        	sc.close();
    }
}



