package javaPractise;

public class Program5 {
	
	public static String getMethod(String s) {
		
		if(s==null) {
			throw new IllegalArgumentException("Input string can not be null");
		}
		if(s.isEmpty()) {
			return " ";
		}
		char[] input = s.toCharArray();
		char[] result= new char[input.length];
		for(int i=0;i<input.length;i++) {
			if(input[i]==' ') {
				result[i]=input[i];
			}
		}
		int j=input.length-1;
		for(int i=0;i<input.length;i++) {
			if(input[i]!=' ') {
				if(result[j]==' ') {
					j--;
				}
				result[j]=input[i];
				j--;
			}
		}
		return new String(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Hi, This is Shubham Sharma.";
		String output=getMethod(input);
		System.out.println(output);

	}

}
