package InvertedStringLine;

public class InvertedStringLine {
	public void invertingString(String str) {
		String[] srr=str.split(" ");
		for(int i=0;i<srr.length;i++) {
			invert(srr[i]);
			System.out.print(" ");
		}
		
	}

	 void invert(String string) {
		// TODO Auto-generated method stub
		for(int i=string.length()-1;i>=0;i--) {
			System.out.print(string.charAt(i));
		}
	}
}
