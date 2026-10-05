package javaPractise;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 2, 4, 5, 1, 6, 2,6};
		
		HashSet<Integer> duplicate= new HashSet<Integer>();
		HashSet<Integer> seen= new HashSet<Integer>();
		
		for(int num:nums) {
			if(seen.contains(num)) {
				duplicate.add(num);
			}else {
				seen.add(num);
			}
		}
		System.out.println(duplicate);
	}

}
