package array;

public class SortElement {
	public static void main(String[] args) {
		int arr[]= {45,5,43,5,87,8,8,42,43};
		int a[]= {-6,-9,-34,-2,67,87,-90};
		//sort(arr);
		AddElement ae=new AddElement();
//		ae.addElement(arr);
//		ae.addElementFirst(arr, 34);
//		ae.addMiddleElement(arr, 13);
//		ae.sortNegativeNumber(a);
//		ae.countDublicateNumber(arr);
		ae.copyOnlyNegativeNumber(a);
	}

	public static void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int s:arr) {
			System.out.println(s);
		}
		
		
	}

}
