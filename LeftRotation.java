package array;

public class LeftRotation {
	public static void main(String[] args) {
		int arr[]= {4,5,6,7,8,9};
		int r=1;
		rotateLeft(arr,r);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	private static void rotateLeft(int[] arr, int r) {
		for(int i=0;i<r;i++) {
			int j;   
			//temporary array to store the newly created array  
			int temp = arr[0];   
			for (j = 0; j < arr.length-1; j++)   
			//shifts array element to the left by 1  
			arr[j] = arr[j + 1];  
			arr[j] = temp;   
			  
		}
	}
		
	}


