package javaPractise;

import java.util.Arrays;

public class AnagramConvept {
	
	public static boolean isAnagram(String str1,String str2) {
		String s1= str1.replaceAll("\\s", "");
		String s2= str2.replaceAll("\\s", "");
		if(s1.length()!=s2.length()) {
			return false;
		}
		char[] c1= s1.toLowerCase().toCharArray();
		char[] c2= s1.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("cat", "acte"));
		System.out.println(isAnagram("cat", "act"));
		System.out.println(isAnagram(" cat", "act"));
		System.out.println(isAnagram("c a t", "act"));
		System.out.println(isAnagram("CAT", "cat"));

	}

}
