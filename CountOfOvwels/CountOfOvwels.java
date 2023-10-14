package CountOfOvwels;

public class CountOfOvwels {
	public void counting(String s1) {
		char[] srr=s1.toCharArray();
		int ovwelCount=0,consonant=0,digit=0;
		for(int i=0;i<srr.length;i++) {
			if(srr[i]=='a'||srr[i]=='e'||srr[i]=='i'||srr[i]=='o'||srr[i]=='u') {
				ovwelCount++;
			}
			else if(srr[i]=='1'||srr[i]=='2'||srr[i]=='3'||srr[i]=='4'||srr[i]=='5'
					||srr[i]=='6'||srr[i]=='7'||srr[i]=='8'||srr[i]=='9') {
				//(int)srr[i]>=0&&(int)srr[i]<=9
				digit++;
			}
			else {
				consonant++;
			}
		}
		System.out.println(ovwelCount);
		System.out.println(consonant);
		System.out.println(digit);
	}
}
