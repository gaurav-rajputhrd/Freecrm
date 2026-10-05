package javaPractise;

public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to Java World Gaurav";
		int count=0;
		String[] s =str.split(" ");
		for(int i=0;i<s.length;i++) {
			count++;
		}
		System.out.println(count);

	}

}
