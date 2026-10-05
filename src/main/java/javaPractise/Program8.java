package javaPractise;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str ="gaurav";
		 String result="";
		 for(int i=0;i<str.length();i++) {
			 char c= str.charAt(i);
			 if(result.indexOf(c)==-1) {
				 result=result+c;
			 }
		 }
		 System.out.println(result);
	}

}
