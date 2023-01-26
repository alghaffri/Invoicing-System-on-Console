package applicationSystem;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class mainMenu {

	Date invoiceDate;
	ArrayList<Item> item = new ArrayList<Item>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean option = true;
		boolean case2loop2 = true;
		Shop shop1 = new Shop();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		invoice invoice1 = new invoice();
	
		// ArrayList<invoice> invoice1 = new ArrayList <invoice>();
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t\t--------------------Invoice-----------------");
		 System.out.println("\t\t\t\t\t " + " Email :shop@icloud.com ");
		 System.out.println("\t\t\t\t\t " + " Website:www.shop.com ");
		 System.out.println("\t\t\t\t\t " + dtf.format(now));
		 System.out.println(" FAX: 03AWBPP8756K592"+" \t\t\t\t\t\t\t TEL: 96677030");
		while (option) {
			System.out.println("\t\t +++++ Select Option +++++");
			System.out.println("\t\t 1-Shop Settings");
			System.out.println("\t\t 2- Manage Shop Items");
			System.out.println("\t\t 3- Create New Invoice");
			System.out.println("\t\t 4- Report: Statistics");
			System.out.println("\t\t 5- Report: All Invoices");
			System.out.println("\t\t 6- Search (1) Invoice");
			System.out.println("\t\t 7- Program Statistics");
			System.out.println("\t\t 8- Exit");

			System.out.println("Enter Your Choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				boolean case2loop = true;
				while (case2loop) {
					System.out.println("1_ Load Data ");
					System.out.println("2_ Set Shop Name ");
					System.out.println("3_ Set Invoice Header  ");
					System.out.println("4_ Back to main Menu");

					if (sc.hasNextInt()) {
						int userSelection = sc.nextInt();
						switch (userSelection) {
						case 1:
							System.out.println(" ------- Load Data ------- ");
							break;
						case 2:
							System.out.println("Enter Shop Name :");
							shop1.SetShopName(sc.next());
							break;
						case 3:
							System.out.print("Please Enter PhoneNO : ");
							String PhoneNo = sc.next();
							System.out.print("Please Enter FaxNO : ");
							String faxNO = sc.next();
							System.out.print("Please Enter Email : ");
							String email = sc.next();
							System.out.print("Please Enter The Website : ");
							String website = sc.next();
							System.out.println("-------- Invoice Header --------");
							break;
						case 4:

							case2loop = false;
							break;
						}
					}
				}
			case 2:

				while (case2loop2) {
					System.out.println("1_ Add Items ");
					System.out.println("2_ Delete Items ");
					System.out.println("3_ Change Item Price ");
					System.out.println("4_ Report All Items");
					System.out.println("5_ Back to main Menu");
					if (sc.hasNextInt()) {
						int userSelection1 = sc.nextInt();

						switch (userSelection1) {
						case 1:

							Item item1 = new Item();
							System.out.print("Enter Item Name : ");
							item1.setItemName(sc.next());
							System.out.print("Enter item Id : ");
							item1.setItemId(sc.nextDouble());
							System.out.print("Enter unit Price : ");
							item1.setUnitPrice(sc.nextDouble());
							System.out.print("Enter quantity : ");
							item1.setQuantity(sc.nextDouble());
							System.out.print("Enter quantityPrice : ");
							item1.setQuantityPrice(sc.nextDouble());
							shop1.addItems(item1);
							break;
						case 2:

							shop1.deleteItems();

							break;
						case 3:
							System.out.println("Enter the item ID: ");
							Integer itemId = sc.nextInt();
							System.out.println("Enter the new price: ");
							Integer newPrice = sc.nextInt();
							shop1.changeItemPrice(itemId, newPrice);

							break;
						case 4:
							shop1.reportAllItems();
							break;

						case 5:
							
							case2loop2 = false;
							break;

						}
					}
				}

			case 3:

				invoice1.Newinvoice();

				break;

			case 4:

				invoice1.reportStat();
				break;

			case 5:	
				invoice1.reportAll();
				break;

			case 6:

				System.out.println("Please Enter invoice number : ");

				int invoiceNo = sc.nextInt();
				invoice1.search(invoiceNo);
				break;

			case 7:

				System.out.println("Program Statistics ");

				break;

			case 8:

				System.out.println("Are you sure you want to exit?");

				if (sc.next().equals("yes")) {

					option = false;

				}

				break;

			}

		}
		sc.close();
	}
}
