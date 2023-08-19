package array;

public class TwoD_Array {
	public static void main(String[] args) {
		int[][] a= {{2,2,2},{3,3,3},{4,4,4}};
		int[][] b= {{1,2,3},{2,3,4},{3,4,5},{4,5,6}};	
		char[] c= {'a','b','A','c'};
		TwoD_Array arr=new TwoD_Array();
//		arr.addTwodArray(a, b);
//		arr.subTwodArray(a, b);
//		arr.transposeArray(a);
		arr.printLowerCases(c);
		
		
		
	}
	void printTwoDArray(int[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		
		}
	}
	void addTwodArray(int[][] a,int[][] b ) {
		if(a.length==b.length && a[0].length==b[0].length) {
			int[][] c=new int[a.length][a[0].length];
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					c[i][j]=a[i][j]+b[i][j];
				}
			}
			System.out.println("Addition of Two Arrays");
			printTwoDArray(c);
		}
	}
	void subTwodArray(int[][] a,int[][] b) {
		if(a.length==b.length && a[0].length==b[0].length) {
			int[][] c=new int[a.length][a[0].length];
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					c[i][j]=a[i][j]-b[i][j];
				}
			}
			System.out.println("Substraction of Two Arrays");
			printTwoDArray(c);
		}
	}
	int[][] transposeArray(int[][] a ) {
		int[][] b=new int[a[0].length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[i][j]=a[j][i];
			}
		}
		printTwoDArray(b);
		return a;
	}
//	void checkBothArray(int[][] a) {
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[0].length;j++) {
//				if(a[i][j]==(a[i][j])) {
//					
//				}
//			}
//		}
//	}
	void printLowerCases(char[] a) {
		int count=0;
		System.out.println(a);
	
		for(int i=0;i<a.length;i++) {
			if(a[i]>=97 ) {
			count++;
			char[] c=new char[count];
				c[i]=a[i];
				System.out.println(c);
			}
			
		}
		
		
	}

	
	
	
	
	
	
}
