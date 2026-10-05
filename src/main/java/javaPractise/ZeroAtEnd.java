package javaPractise;

public class ZeroAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,0,20,0,3,4,0};
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[index]=arr[i];
				index++;
			}
		}
		while(index<arr.length) {
			arr[index]=0;
			index++;
		}
		for(int num: arr) {
			System.out.print(num+" ");
		}
	}

}
