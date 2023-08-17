package array;

public class AddElement {
	void addElement(int[] arr) {
		int[] newElmt=new int[arr.length+1];
		int newNumber=99;
		for(int i=0;i<newElmt.length;i++) {
			if(i==newElmt.length-1) {
				newElmt[i]=newNumber;
			}
			else {
				newElmt[i]=arr[i];
			}
		}
		System.out.println("Add Element in Last index ");
		for(int a:newElmt) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	void addElementFirst(int[] arr,int newNum) {
		int[] newArray=new int[arr.length+1];
		for(int i=0;i<newArray.length;i++) {
			if(i==newArray[0]) {
				newArray[i]=newNum;
				
			}
			else {
				newArray[i]=arr[i-1];
			}
		}
		System.out.println("Add Elements in First Array ");
		for(int b:newArray) {
			System.out.print(b+" ");
		}
		System.out.println();
	}
	void addMiddleElement(int[] arr,int newNum) {
		
		int[] newArray=new int[arr.length+1];
		for(int i=0;i<newArray.length;i++) {
			if(i==arr.length/2) {
				newArray[i]=newNum;
			}
//			else if(i==arr.length/2+1) {
//				newArray[i]=arr[i-1];
//			}
			else if(i>arr.length/2) {
				newArray[i]=arr[i-1];
			}
			else {
				newArray[i]=arr[i];
			}
		}
		System.out.println("Add Elements in Middle");
		for(int m:newArray) {
			System.out.print(m+" ");
		}
	}
	void sortNegativeNumber(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		
	       }
		}
		System.out.println("Sort only Negetive Number");
		for(int c:arr) {
			System.out.println(c);
		}
	}
	void countDublicateNumber(int[] arr) {
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					//int temp=-1;
					String duplicate="This value once Done";
					count++;
				}
			}
		}//int arr[]= {45,5,43,5,87,8,8,42,43};
		System.out.println("Dublicate value in an array of "+count);
	}
	void copyOnlyNegativeNumber(int[] arr) {
		int count=0;
		int temp;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				temp=arr[i];
				
			}
		}
//		int[] negative=new int[count];
//		for(int j=0;j<arr.length;j++) {
//			if(arr[j]<0) {
//				negative[j]=arr[j];
//			}
//		}
//		for(int n:negative) {
//			System.out.println(n);
//		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}
