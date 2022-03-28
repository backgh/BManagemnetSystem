package BusManagementSystem;

import java.util.Scanner;

public class BusManagementMenu {
	public static void main(String[] args) {

		int num =5;
		Scanner input = new Scanner(System.in);

		while (num !=6) { // num�� 6�� �ƴ� ���� �ݺ��ؼ� ����ǵ��� while�� ����
			System.out.println(" *** Bus Management System Menu ***");
			System.out.println("1. Add Bus ");
			System.out.println("2. Delete Bus ");
			System.out.println("3. Edit Bus ");
			System.out.println("4. View Bus ");
			System.out.println("5. Show Bus ");
			System.out.println("6. Exit ");
			System.out.println("Select one number between 1 - 6");
			num = input.nextInt();
			if(num == 1) { // �Է��� ���ڰ� 1�� ��� �ش� �Լ��� 
				addbus();
			}
			else if (num == 2) { // �Է��� ���ڰ� 2�� ���
				deletebus();
			}
			else if (num == 3) { // �Է��� ���ڰ� 3�� ���
				editbus();
			}
			else if (num == 4) { // �Է��� ���ڰ� 4�� ���
				viewbus();
			}
			else continue; // ���
		}
		
		
	}
	public static void addbus() { // addbus���� ������ ����
		Scanner input = new Scanner(System.in);
		System.out.println("Bus Number: ");
		int busnumber = input.nextInt(); 
		input.nextLine(); //�� �ٲ�
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
