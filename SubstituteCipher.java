import java.util.*;
class substitutecipher
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String text,ctext="",dtext="";
		String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String key="QWERTYUIOPASDFGHJKLZXCVBNM";
		System.out.print("Enter text:");                   
		text=sc.nextLine().toUpperCase();
		for(int i=0;i<text.length();i++)
		{
			char ch;
			ch=text.charAt(i);
			for(int j=0;j<26;j++)
			{
				if(ch==alphabet.charAt(j))
				{
					ctext=ctext+key.charAt(j);
				}
			}
				if(ch==' ')
				{
					ctext=ctext+" ";
				}
		}	
	System.out.println("encrypted text :"+ctext);
	for(int i=0;i<ctext.length();i++)
		{
			char ch;
			ch=ctext.charAt(i);
			for(int j=0;j<26;j++)
			{
				if(ch==key.charAt(j))
				{
					dtext=dtext+alphabet.charAt(j);
				}
			}
				if(ch==' ')
				{
					dtext=dtext+" ";
				}
		}	
	System.out.println("decrypted text :"+dtext);

	}
}

                                                                                                                                                                                                                                                                             
