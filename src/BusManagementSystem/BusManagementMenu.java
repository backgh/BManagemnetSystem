package BusManagementSystem;

import java.util.Scanner;

public class BusManagementMenu {
	public static void main(String[] args) {

		int num =5;
		Scanner input = new Scanner(System.in);

		while (num !=6) { // num이 6이 아닌 동안 반복해서 진행되도록 while문 선언
			System.out.println(" *** Bus Management System Menu ***");
			System.out.println("1. Add Bus ");
			System.out.println("2. Delete Bus ");
			System.out.println("3. Edit Bus ");
			System.out.println("4. View Bus ");
			System.out.println("5. Show Bus ");
			System.out.println("6. Exit ");
			System.out.println("Select one number between 1 - 6");
			num = input.nextInt();
			if(num == 1) { // 입력한 숫자가 1인 경우 해당 함수로 
				addbus();
			}
			else if (num == 2) { // 입력한 숫자가 2인 경우
				deletebus();
			}
			else if (num == 3) { // 입력한 숫자가 3인 경우
				editbus();
			}
			else if (num == 4) { // 입력한 숫자가 4인 경우
				viewbus();
			}
			else continue; // 계속
		}
		
		
	}
	public static void addbus() { // addbus에서 진행할 과정
		Scanner input = new Scanner(System.in);
		System.out.println("Bus Number: ");
		int busnumber = input.nextInt(); 
		input.nextLine(); //줄 바꿈
		System.out.println("Bus Number Plate:");
		String busnumberplate = input.nextLine();
		System.out.print("Bus Start Point: ");
		String busstartpoint = input.nextLine();
		System.out.println("Bus Terminal: ");
		String busterminal = input.nextLine();
		System.out.println("Bus Operating Hours in a Day: ");
		String busoperatinhoursinaday = input.nextLine();
		System.out.print("Total Number of Passengers: ");
		String totalnumberofpassengers = input.nextLine();
		System.out.print("Total Bus Income per day: ");		
		String totalbusincomeperday = input.nextLine();	
	}
	
	public static void deletebus() {
		Scanner input = new Scanner(System.in);
		System.out.println("Bus Number: ");
		int busnumber = input.nextInt(); 
		input.nextLine(); 
		System.out.println("Bus Number Plate:");
		String busnumberplate = input.nextLine();
		System.out.print("Bus Start Point: ");
		String busstartpoint = input.nextLine();
		System.out.println(busstartpoint);
		System.out.println("Bus Terminal: ");
		String busterminal = input.nextLine();
		System.out.println("Bus Operating Hours in a Day: ");
		String busoperatinhoursinaday = input.nextLine();
		System.out.print("Total Number of Passengers: ");
		String totalnumberofpassengers = input.nextLine();
		System.out.print("Total Bus Income per day: ");		
		String totalbusincomeperday = input.nextLine();		
	}

	public static void editbus() {
		Scanner input = new Scanner(System.in);
		System.out.println("Bus Number: ");
		int busnumber = input.nextInt(); 
		input.nextLine(); 
		System.out.println("Bus Number Plate:");
		String busnumberplate = input.nextLine();
		System.out.print("Bus Start Point: ");
		String busstartpoint = input.nextLine();
		System.out.println(busstartpoint);
		System.out.println("Bus Terminal: ");
		String busterminal = input.nextLine();
		System.out.println("Bus Operating Hours in a Day: ");
		String busoperatinhoursinaday = input.nextLine();
		System.out.print("Total Number of Passengers: ");
		String totalnumberofpassengers = input.nextLine();
		System.out.print("Total Bus Income per day: ");		
		String totalbusincomeperday = input.nextLine();		
	}

	public static void viewbus() {
		Scanner input = new Scanner(System.in);
		System.out.println("Bus Number: ");
		int busnumber = input.nextInt(); 
		input.nextLine(); 
		System.out.println("Bus Number Plate:");
		String busnumberplate = input.nextLine();
		System.out.print("Bus Start Point: ");
		String busstartpoint = input.nextLine();
		System.out.println(busstartpoint);
		System.out.println("Bus Terminal: ");
		String busterminal = input.nextLine();
		System.out.println("Bus Operating Hours in a Day: ");
		String busoperatinhoursinaday = input.nextLine();
		System.out.print("Total Number of Passengers: ");
		String totalnumberofpassengers = input.nextLine();
		System.out.print("Total Bus Income per day: ");		
		String totalbusincomeperday = input.nextLine();	
	}


}
