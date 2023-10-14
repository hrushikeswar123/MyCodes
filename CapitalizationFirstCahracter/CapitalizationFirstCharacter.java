package CapitalizationFirstCahracter;

public class CapitalizationFirstCharacter {
	public void Capitalizing(String str) {
		String[] srr=str.split(" ");
		
		for(int i=0;i<srr.length;i++){
			captial(srr[i]);
			System.out.print(" ");
		}
	}

	 void captial(String string) {
		// TODO Auto-generated method stub
		char arr[]=string.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[0]>=97&&arr[0]<=122) {
			arr[0]=(char)(arr[0]-32);
			}
			
		}
		for(char i: arr) {
			System.out.print(i);
		}
	}

}
