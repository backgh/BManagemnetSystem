package BusManagementSystem;

import java.util.Scanner;

public class BusManagementMenu {
	public static void main(String[] args) {

		int num =0;
		Scanner input = new Scanner(System.in);

		while (num !=6) {
			System.out.println("1. Add Bus ");
			System.out.println("2. Delete Bus ");
			System.out.println("3. Edit Bus ");
			System.out.println("4. View Bus ");
			System.out.println("5. Show Bus ");
			System.out.println("6. Exit ");
			System.out.println("Select one number between 1 - 6");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("Bus Number: ");
				int BusNumber = input.nextInt();
				System.out.print("Bus Number Plate: ");
				String BusNumberPlate = input.next();
				break;
			case 2:
				System.out.print("Bus Start point: ");
				String BusStartPoint = input.next();
				System.out.print(" Bus Terminal: ");
				String BusTermianl = input.next();
				break;
			case 3:
				System.out.print(" Bus Operating Hours in a Day: ");
				int BusOperatingHoursinaDay = input.nextInt();
				break;
				
			case 4:
				System.out.print(" Total Number of Passengers: ");
				int TotalNumberofPassengers = input.nextInt();
				break;
				
			case 5:
				System.out.print("Total Bus income per day: ");
				int TotalBusincomeperday = input.nextInt();
				break;
				
			}
		}

	}
}
