package applicationSystem;

import java.util.Scanner;

public class mainMenu {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("+++++++++++++++++");
		System.out.println("++++ Invoice System ++++");
		System.out.println("\\t\\t\\t\\t 1-Shop Settings");
		System.out.println("\\t\\t\\t\\t 2- Manage Shop Items");
		System.out.println("\\t\\t\\t\\t 3- Create New Invoice");
		System.out.println("\\t\\t\\t\\t 4- Report: Statistics");
		System.out.println("\\t\\t\\t\\t 5- Report: All Invoices");
		System.out.println("\\t\\t\\t\\t 6- Search (1) Invoice");
		System.out.println("\\t\\t\\t\\t 7- Program Statistics");
		System.out.println("\\t\\t\\t\\t 8- Exit");
		
		int condtion = sc.nextInt();
		switch (condtion) {
		case 1:
			System.out.println("1-Shop Settings");
			break;
		case 2:
			System.out.println(" 2- Manage Shop Items");
			break;
		
	}
	}
	

}
