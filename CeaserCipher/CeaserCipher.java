package CeaserCipher;

public class CeaserCipher {
	public void cipherkey(String s1,int key) {
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			if(c=='Y') {
				System.out.print((char)(c+key-26));
			}
			else if(c=='y') {
				System.out.print((char)(c+key-26));
			}
			else if(c=='Z') {
				System.out.print((char)(c+key-26));
				
			}
			else if(c=='z') {
				System.out.print((char)(c+key-26));
			}
			else {
				System.out.print((char)(c+key));
			}
		}

	}

}
