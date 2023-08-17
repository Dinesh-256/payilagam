package electricityBillCalculate;

import java.util.Scanner;

public class ElectricityBill {
	int ebNo;
	int PMonthReading;
	int CMonthReading;
	int consumedUnits;

	static String getEbNumber(int ebNumber) throws InvalidNumberException {

		int count = 0;
		while (ebNumber != 0) {
			ebNumber = ebNumber / 10;
			count++;

		}

		if (count < 8 || count > 8 || count < 0) {
			throw new InvalidNumberException("Number is invalid Please check the Number");

		} else

			return getUnits();

	}

	public static void main(String[] args) {



		try { Scanner sc=new Scanner(System.in);
		System.out.println("Enter the EB Number");

		System.out.println(getEbNumber(sc.nextInt())); 
		sc.close(); 
		} 
		catch
		(InvalidNumberException e) { 
			System.out.println(e.getMessage());
		}



		}

	private static String getUnits() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units");
		int units = sc.nextInt();
		sc.close();
		if (units < 100) {
			System.out.println("No charges");
		} else if (units > 100 && units < 200) {
			int cost = 220;
			units = units - 100;
			System.out.println(Math.round(Math.multiplyFull(units, cost) / 100));
		} else if (units > 200 && units < 400) {
			int cost = 450;
			units = units - 100;
			System.out.println(Math.round(Math.multiplyFull(units, cost) / 100));
		} else if (units > 400 && units < 500) {
			int cost = 600;
			units = units - 100;
			System.out.println(Math.round(Math.multiplyFull(units, cost) / 100));
		} else if (units > 500 && units < 600) {
			int cost = 800;
			units = units - 100;
			System.out.println(Math.round(Math.multiplyFull(units, cost) / 100));
		} else if (units > 600 && units < 800) {
			int cost = 900;
			units = units - 100;
			System.out.println(Math.round(Math.multiplyFull(units, cost) / 100));
		} else if (units > 800 && units < 1000) {
			int cost = 1000;
			units = units - 100;
			System.out.println(Math.round(Math.multiplyFull(units, cost) / 100));
		} else if (units > 800 && units < 1000) {
			int cost = 1000;
			units = units - 100;
			System.out.println(Math.round(Math.multiplyFull(units, cost) / 100));
		} else if (units > 1000) {
			int cost = 1100;
			units = units - 100;
			System.out.println(Math.round(Math.multiplyFull(units, cost) / 100));
		}
		return "ThankYou";

	}

}
