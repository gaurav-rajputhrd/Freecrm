package javaPractise;

public class ZeroAtStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,0,2,0,3,4,0};
		int lastIndex=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				arr[lastIndex]=arr[i];
				lastIndex--;
			}
		}
		for(int i=0;i<=lastIndex;i++) {
			arr[i]=0;
		}
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}

}
