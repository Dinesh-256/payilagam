package electricityBillCalculate;

import java.util.Scanner;

public class ElectricityBillCalculator {
	int PMonthReading;
	int CMonthReading;
	int ConsumedUnits;
	int EbNo;
	
	private void getEbNumber() throws OverTimeException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The EB Number");
		try {
		EbNo=sc.nextInt();
		int dcount=0;
		while(EbNo!=0) {
			EbNo=EbNo/10;
			dcount++;
		}
		
			if(dcount>8 || dcount<8 || dcount<0 ) {
				throw new InvalidNumberException("Number is invalid");
			}
			else 
				 getUnits(CMonthReading(),PMonthReading());	
		}			
		catch(InvalidNumberException e){
			System.out.println(e.getMessage());
			
			getEbNumber();
		}
			
	}
	private int PMonthReading() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the PMonthReading Units");
		PMonthReading=sc.nextInt();
		
		return PMonthReading;
				
	}
	public int CMonthReading() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the CurrentMonth Reading");
		CMonthReading=sc.nextInt();
		
		return CMonthReading;
		
			
		
	}
	public void getUnits(int CMonthReading2, int PMonthReading3) {
		ConsumedUnits =CMonthReading2-PMonthReading3;
	    getBillAmount(ConsumedUnits);
		
	}
	public void getBillAmount(int units) {
		if(units<0) {
			System.out.println("Please check the Reading");
			getUnits(CMonthReading(),PMonthReading());
		}
	      else if (units < 100) {
			System.out.println("No charges");
			
		}
		
		  else if (units > 100 && units < 200) {
			int cost = 225;
			units = units - 100;
			int amount=Math.round(Math.multiplyFull(units, cost) / 100);
			System.out.println("You have to Pay amount of "+amount);
		} else if (units > 200 && units < 400) {
			int cost = 450;
			units = units - 100;
			int amount=Math.round(Math.multiplyFull(units, cost) / 100);
			System.out.println("You have to Pay amount of "+amount);		
		} 
		    else if (units > 400 && units < 500) {
			int cost = 600;
			units = units - 100;
			int amount=Math.round(Math.multiplyFull(units, cost) / 100);
			System.out.println("You have to Pay amount of "+amount);
			
		} else if (units > 500 && units < 600) {
			int cost = 800;
			units = units - 100;
			int amount=Math.round(Math.multiplyFull(units, cost) / 100);
			System.out.println("You have to Pay amount of "+amount);
		
		} else if (units > 600 && units < 800) {
			int cost = 900;
			units = units - 100;
			int amount=Math.round(Math.multiplyFull(units, cost) / 100);
			System.out.println("You have to Pay amount of "+amount);
			
		} else if (units > 800 && units < 1000) {
			int cost = 1000;
			units = units - 100;
			int amount=Math.round(Math.multiplyFull(units, cost) / 100);
			System.out.println("You have to Pay amount of "+amount);
			
		} else if (units > 1000) {
			int cost = 1100;
			units = units - 100;
			int amount=Math.round(Math.multiplyFull(units, cost) / 100);
			System.out.println("You have to Pay amount of "+amount);
		
		}
	}
	

	public static void main(String[] args) throws OverTimeException {
		ElectricityBillCalculator eb=new ElectricityBillCalculator();
		eb.getEbNumber();
		
		
	}
	
	


	


}
