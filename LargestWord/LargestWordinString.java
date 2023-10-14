package LargestWord;

public class LargestWordinString {
public void findingLargeWord(String str) {
	String[] srr=str.split(" ");
	int wordlength=0;
	int index=0;
	for(int i=0;i<srr.length;i++) {
		if(wordlength<srr[i].length()) {
			wordlength=srr[i].length();
			index=i;
		}
	}
	String s2=srr[index];
	System.out.println("The largeWord in the String is : ");
	System.out.print(s2);
}
}
