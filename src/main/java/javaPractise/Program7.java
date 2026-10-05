package javaPractise;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="automation";
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				 char[] c= str.toCharArray();
				if(c[i]==c[j]) {
					System.out.println(c[i]);
				}
			}
		}

	}

}
