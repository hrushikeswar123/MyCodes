package ReverseStringLine;

public class ReverseStringLine {
	public void reversingString(String str) {
		String srr[] = str.split(" ");
		for (int i = srr.length - 1; i >= 0; i--) {
			System.out.print(srr[i] + " ");
		}
	}
}
