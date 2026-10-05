package javaPractise;

public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Subbu123raj";
		StringBuilder alphabet= new StringBuilder();
		StringBuilder digit= new StringBuilder();
		char[] c= str.toCharArray();
		for(char s:c) {
			if(Character.isLetter(s)) {
				alphabet.append(s);
			}else if (Character.isDigit(s)) {
				digit.append(s);
			}
		}
		System.out.println(alphabet);
		System.out.println(digit);
	}

}
