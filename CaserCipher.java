import java.util.*;
class CaserCipher{
    public static void main(String args[]){
        String text,ctext="",dtext="";
        int shift;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text:");
        text=sc.nextLine();
        System.out.println("Enter shift number:");
        shift=sc.nextInt();
        for(int i=0;i<text.length();i++)
        {   
            char ch;
            ch=text.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                ctext=ctext+(char)((ch-'A'+shift)%26+'A');
            }
            else if(ch>='a' && ch<='z'){
                ctext=ctext+(char)((ch-'a'+shift)%26+'a');

            }
            else{
                ctext=ctext+ch;
            }
        }
        System.out.println("Encrypted text: "+ctext);
        for(int i=0;i<ctext.length();i++)
        {   
            char ch;
            ch=ctext.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                dtext=dtext+(char)((ch-'A'+26-shift)%26+'A');
            }
            else if(ch>='a' && ch<='z'){
                dtext=dtext+(char)((ch-'a'+26-shift)%26+'a');

            }
            else{
                dtext=dtext+ch;
            
            }
        }
        System.out.println("decrypted text: "+dtext);
    }
}
