package rishi.test;

import java.util.Set;

public class prime {
	
	public static void main(String[] args) {
		
		String s = "ACACB";
		for(int i = 0; i < s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (s.charAt(j) == s.charAt(i)) {
					System.out.println(s.charAt(j));
				}
			}
		}
	}

}

