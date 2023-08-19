package array;

public class ArrayExample {
	public void reverseOrder(int[] x) {
		for(int i=x.length-1;i>=0;i--) {
			System.out.println(x[i]);
		}
		System.out.println();
	}
	public void presentOrNot(int[] x) {
		int y=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]==5) {
				y=x[i];
			}
		}
		if(y==5) {
			System.out.println("5 present in the Array");
		}
		else {
			System.out.println("5 Not present in the Array");
		}
		
	}
	public void largestNumber(int[] x) {
		int a=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]>a) {
				a=x[i];
			}
		}
		System.out.println("The Largest Number is "+a);
	}
	public void smallestNumber(int[] x) {
		int a=x[0];
		for(int i=0;i<x.length;i++) {
			if(x[i]<a) {
				a=x[i];
			}
		}
		System.out.println("The Smallest Number is "+a);
	}
	public void secandLargestNumber(int[] x,int num) {
		
		int largest=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]>largest) {
				largest=x[i];				
			}
		}
		System.out.println("Secand largest Number"+x[num-2]);
	}
	public void secandSamallestNumber(int[] x,int num) {
		int smallest=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]<smallest) {
				smallest=x[i];				
			}
		}
		System.out.println("Secand smallest Number "+x[num-7]); 
	}
	public void singleRotation(int[] x) {
		
		int a=x[0];
		for(int i=0;i<x.length;i++) {
			//a[0]=a[1];
		}
	}
	public static void main(String[] args) {
		int[] a= {453,55,21,45,78,4,98,127,89};
		ArrayExample ae=new ArrayExample();
		ae.reverseOrder(a);
		ae.presentOrNot(a);
		ae.largestNumber(a);
		ae.smallestNumber(a);
		ae.secandLargestNumber(a,9);
		ae.secandSamallestNumber(a,9);
	}

}
