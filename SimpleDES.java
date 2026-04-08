public class SimpleDES {
	static int[] xor(int[] a,int[] b){
	int[] r = new int[a.length];
	for(int i=0;i<a.length;i++)
		r[i]=a[i]^b[i];
	return r;
}
public static void main(String[] args) {
	int[] plaintext = new int[64];
	for(int i=0; i<64;i++)
		plaintext[i]=i%2;
		int[] L= new int[32];
		int[] R= new int[32];
	System.arraycopy(plaintext, 0,L,0,32);
	System.arraycopy(plaintext, 0,R,0,32);
	int[] key = new int[32];
	for(int i=0;i<32;i++)
		key[i]=1;
	for(int i=0;i<16;i++) {
		int[] temp=R;
		R=xor(L, xor(R,key));
		L=temp;
	}
	int[] cipher = new int[64];
	 System.arraycopy(R, 0, cipher, 0, 32);
        System.arraycopy(L, 0, cipher, 32, 32);

        System.out.println("Encrypted Text:");
      for (int i = 0; i < cipher.length; i++) {
    System.out.print(cipher[i]);
}
    }
}
	

