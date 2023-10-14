package Anagram;

public class Anagram {
	public void Verifying(String s1,String s2){
		char crr1[]=s1.toCharArray();
		char crr2[]=s2.toCharArray();
		int count=0;
		//calling sort method
		 crr1=sort(crr1);
		 crr2=sort(crr2);
		 
		 //checking wheather the sorted arrays 
		if(crr1.length==crr2.length) {
			for(int i=0;i<crr1.length;i++) {
				if(crr1[i]==crr2[i]) {
					count++;
				}
			}
			
		}
		else {
			System.out.println("Not a Anagram");
		}
		
		//verifying 
		if(count==crr1.length) {
			System.out.println("Angram");
		}
		else {
			System.out.println("Not Angram");
		}
	}
	static char[] sort(char crr[]) {
		char temp;
		for(int i =0;i<crr.length;i++) {
			for(int j=0;j<crr.length-1;j++) {
				if(crr[j]>crr[j+1]) {
					temp=crr[j];
					crr[j]=crr[j+1];
					crr[j+1]=temp;
				}
			}
		}
		return crr;
	}
}
