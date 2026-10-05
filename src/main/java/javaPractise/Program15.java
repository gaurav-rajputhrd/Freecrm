package javaPractise;

public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aBACbcEDed";
		System.out.println(str);
		StringBuilder lowerCase = new StringBuilder();
		StringBuilder uppercase= new StringBuilder();
		char[] c= str.toCharArray();
		for(char c1:c) {
			if(Character.isLowerCase(c1)) {
				lowerCase.append(c1);
			}else {
				uppercase.append(c1);
			}
		}
		System.out.println(lowerCase);
		System.out.println(uppercase);
	}

}
