package oct3;

import java.util.Iterator;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 = "apple";
//		String s2 = "aeppl ";
//
//		System.out.println(s1.compareTo(s2));
		
		String s1 = "pragra";
		int len = s1.length();
		char[] ch = s1.toCharArray();
		
		for(char elements:ch) {
			System.out.print(elements + " ");
		}
		System.out.println();

		char[] ch2 = new char[len];
		for(char e:ch) {
			ch2[len-1] = e;
			len--;
		}
		
		for(char elements:ch2) {
			System.out.print(elements + " ");
		}
		
//		for (int i = s1.length()-1; i >=0 ; i--) {
//			System.out.print(s1.charAt(i) + " ");
//		}
	}

}
