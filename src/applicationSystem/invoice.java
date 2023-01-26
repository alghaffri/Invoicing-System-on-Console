package applicationSystem;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class invoice implements Serializable {

	String customerName;
	int customerphonenumber;
	double numberOfItems;
	double totalAmount;
	double paidAmount;
	double balance;
	int invoiceNo = 0;
	ArrayList<Item> item = new ArrayList<Item>();
	
	ArrayList<invoice> invoice1 = new ArrayList<invoice>();
	public void SetinvoiceHeader() {
	}

	
	public void reportStat() {
		for(invoice i : invoice1) {
			System.out.println("-------------- Invoice Detail ------------");
			System.out.println(" Number of invpices : "+invoice1.size());
		
			System.out.println(" Number of items : "+i.numberOfItems);
			System.out.println(" Total Sales : "+i.totalAmount);

		}
	}
	public void reportAll() {
		System.out.println("------------------ALL INVOICE DETAIL------------------");
		for(invoice i : invoice1) {
			System.out.println("-------------- Invoice Detail ------------");
			System.out.println("Customer Name : "+i.customerName);
			System.out.println("Customer Number : "+i.customerphonenumber);
			System.out.println("Customer number of items : "+i.numberOfItems);
			System.out.println("Customer Total Amount : "+i.totalAmount);
			System.out.println("Customer Paid Amount : "+i.paidAmount);
			System.out.println("Customer Balance : "+(i.balance));
		}
	}
	public void search(int invoiceNo) {
		if(invoice1.size() > 0) {
			for(int i = 0 ; i < invoice1.size(); i++) {
				if(invoiceNo == invoice1.get(i).invoiceNo ) {
					System.out.println("-------------Invoice Detail-------------");
					System.out.println("Invoice number : "+invoice1.get(i).invoiceNo );
					System.out.println("Customer name: "+invoice1.get(i).customerName );
					System.out.println("Customer PhoneNo: "+invoice1.get(i).customerphonenumber );
					System.out.println("Customer No of Items: "+invoice1.get(i).numberOfItems );
					System.out.println("Customer Total Amount: "+invoice1.get(i).totalAmount );
					System.out.println("Customer Paid Amount : "+invoice1.get(i).paidAmount );
					System.out.println("Customer Balance: "+invoice1.get(i).balance );
				}
			}
			
		}
		
	}

	

	public void Newinvoice() {
		invoiceNo++;
		invoice i = new invoice();
		Scanner sc = new Scanner(System.in);

		// Shop shop1 = new Shop();
		// System.out.print("Enter Shop Name : ");
		// shop1.setName(sc.next());

		System.out.print("Enter Customer Name : ");
		i.customerName = sc.next();

		System.out.print("Enter customer phone number : ");
		i.customerphonenumber = sc.nextInt();

		System.out.print("Number Of Items : ");
		i.numberOfItems = sc.nextDouble();

		System.out.print("Total Amount : ");
		i.totalAmount = sc.nextDouble();

		System.out.print("Paid Amount : ");
		i.paidAmount = sc.nextDouble();
		i.balance = i.totalAmount - i.paidAmount;

		boolean choice = true;

		while (choice) {
			Item item1 = new Item();
			System.out.print("Enter Item Name : ");
			item1.setItemName(sc.next());
			System.out.print("Enter item Id : ");
			item1.setItemId(sc.nextDouble());
			System.out.print("Enter unit Price : ");
			item1.setUnitPrice(sc.nextDouble());
			System.out.print("Enter quantity : ");
			item1.setQuantity(sc.nextDouble());
			
			item1.setQuantityPrice(item1.unitPrice * item1.quantity);
			System.out.println("quantity Price : "+item1.quantityPrice);
			System.out.println("\"Want to add more items? 1 if yes : \"");
			if (sc.nextInt() != 1) {
				choice = false;

			}
		}
		invoice1.add(i);

		// Serializaion
		try {
			FileOutputStream file = new FileOutputStream("invoice.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(customerName);
			out.writeObject(customerphonenumber);
			out.writeObject(numberOfItems);
			out.writeObject(totalAmount);
			out.writeObject(paidAmount);
			out.writeObject(balance);
			// out.writeObject(shop1);
			out.close();
			file.close();
			System.out.println("serialized and saved");
		} catch (Exception e) {
			e.printStackTrace();
		}
		// --------------------------------------------------------

	}

}
