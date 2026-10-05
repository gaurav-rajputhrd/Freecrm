package javaPractise;

public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Automation Test Engineer";
		
		String s= str.replaceAll("\\s", "");
		System.out.println(s);
		
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i)+"----->"+i);
		}

	}

}
