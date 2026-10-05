package javaPractise;

import java.util.ArrayList;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,3,3,4,5,6,6,7,8,9,9};
		
		System.out.println("Enter the Element to be Search: ");
		Scanner scanner=new Scanner(System.in);
		int searchElement= scanner.nextInt();
		
		ArrayList<Integer> index= new ArrayList<Integer>();
		
		for(int i=0;i<num.length;i++) {
			if(num[i]==searchElement) {
				index.add(i);
			}
		}
		if(!index.isEmpty()) {
			for(int i: index) {
				System.out.println(i);
			}
			
		}else {
			System.out.println("element not found");
		}
	}

}
