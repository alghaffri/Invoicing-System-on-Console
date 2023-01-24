package applicationSystem;


import java.util.Scanner;

public class mainMenu {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList<invoice> invoice1 = new ArrayList <invoice>();
		Scanner sc = new Scanner(System.in);
		 System.out.println("\t\t\t\t--------------------Invoice-----------------");    
	        System.out.println("\t\t\t\t\t " + "  Email :shop@icloud.com "); 
	        System.out.println("\t\t\t\t\t " + "  Website:www.shop.com "); 
	        System.out.println(" FAX: 03AWBPP8756K592"+" \t\t\t\t\t\t\t  TEL: 96677030");
		
	
		
		System.out.println("+++++++++++++++++");
		System.out.println("\t ++++ Invoice System ++++");
		System.out.println("\t\t 1-Shop Settings");
		System.out.println("\t\t 2- Manage Shop Items");
		System.out.println("\t\t 3- Create New Invoice");
		System.out.println("\t\t 4- Report: Statistics");
		System.out.println("\t\t 5- Report: All Invoices");
		System.out.println("\t\t 6- Search (1) Invoice");
		System.out.println("\t\t 7- Program Statistics");
		System.out.println("\t\t 8- Exit");
		
		
		int condtion = sc.nextInt();
		switch (condtion) {
		case 1:
			System.out.println("1-Shop Settings");
			break;
			
		case 2:
			System.out.println(" 2- Manage Shop Items");
			break;
			
		case 3:
			invoice invoice1 = new invoice();
			
			invoice1.Newinvoice();
			break;
			
		case 4:
			Report report1 = new Report();
			report1.newReport();
			break;
	}sc.close();
	}
	

}
