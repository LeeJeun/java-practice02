package prob04;

import java.util.Arrays;

public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		char reverseArray[] = new char[str.length()];
		int strIndex = str.length()-1;
		
		for(int i=0; i<=reverseArray.length-1; i++) {
			reverseArray[i] = str.charAt(strIndex);
			strIndex-=1;
		}
		return reverseArray;
	}

	public static void printCharArray(char[] array){
		System.out.println(array);
	}
}