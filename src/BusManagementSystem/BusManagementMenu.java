package BusManagementSystem;

import java.util.Scanner;

public class BusManagementMenu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BusManager BusManager = new BusManager();
		
		int num =0;
		while (num !=5) { //num이 6이 아닌 동안 반복해서 진행되도록 while문 선언
			System.out.println(" *** Bus Management System Menu ***");
			System.out.println("1. Add Bus ");
			System.out.println("2. Delete Bus ");
			System.out.println("3. Edit Bus ");
			System.out.println("4. View Bus ");
			System.out.println("5. Exit ");
			System.out.println("Select one number between 1 - 5");
			num = input.nextInt();
			input.nextLine();
			System.out.println("");
			if(num == 1) { // 
				BusManager.addBus();
			}
			else if (num == 2) { 
				BusManager.deleteBus();
			}
			else if (num == 3) { 
				BusManager.editBus();
			}
			else if (num == 4) { 
				BusManager.viewBus();
			}
			else if( num == 5) {
				continue;
			}
			else if( num >=6)
			{
				System.out.println("");
				System.out.println("");
			}
		}
		System.out.println("End.");
	}
}