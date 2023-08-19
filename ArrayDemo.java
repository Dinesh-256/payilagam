package array;

public class ArrayDemo {
	public static void main(String[] args) {
		int marks[]= {56,34,67,34,12,766,8767,976};
		
		System.out.println("Print all Even Number");
		for(int i=0;i<marks.length;i++) {
			if(marks[i]%2==0) {
				System.out.println(marks[i]);
			}
		}
		
		System.out.println("Print all odd Number");
		for(int j=0;j<marks.length;j++) {
			if(marks[j]%2!=0) {
				System.out.println(marks[j]);
			}
		}
		System.out.println("Print all the even indexes Number");
		for(int k=0;k<marks.length;k++) {
			if(k%2==0) {
				System.out.println(marks[k]);
			}
		}
		System.out.println("Print all the odd indexes Number");
		for(int k=0;k<marks.length;k++) {
			if(k%2!=0) {
				System.out.println(marks[k]);
			}
		}
		System.out.println("Sum of Elements in an Array");
		int sum=0;
		for(int l=0;l<marks.length;l++) {
			sum=sum+marks[l];
		}
		System.out.println(sum);
		System.out.println("Sum of Even digit Number");
		int sum1=0;
		for(int m=0;m<marks.length;m++) {
			if(marks[m]%2==0) {
				sum1=sum1+marks[m];
			}
		}
		System.out.println(sum1);
		System.out.println("Sum of Odd digit Number");
		int sum2=0;
		for(int m=0;m<marks.length;m++) {
			if(marks[m]%2!=0) {
				sum2=sum2+marks[m];
			}
		}
		System.out.println(sum2);
		System.out.println("Sum of Even Indexed");
		int sum3=0;
		for(int k=0;k<marks.length;k++) {
			if(k%2==0) {
				sum3=sum3+marks[k];
			}
		}
		System.out.println(sum3);
		System.out.println("Sum of Odd Indexed");
		int sum4=0;
		for(int k=0;k<marks.length;k++) {
			if(k%2!=0) {
				sum4=sum4+marks[k];
			}
		}
		System.out.println(sum4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
