package javaPractise;

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Java is good programming langauges";
		String rev="";
		String[] s= str.split(" ");
		for(String s1:s) {
			String revWord="";
			for(int i=s1.length()-1;i>=0;i--) {
				revWord=revWord+s1.charAt(i);
			}
			rev=rev+revWord+" ";
		}
		System.out.println(rev);

	}

}
