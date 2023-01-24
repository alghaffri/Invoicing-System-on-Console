package applicationSystem;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class invoice implements Serializable {
	
	String customerName;
	int customerphonenumber;
	int  invoiceDate;
	 double numberOfItems;
	 double totalAmount;
	 double paidAmount;
	 double balance;
	 
	 public void SetinvoiceHeader() {
		  }
	 
	 
	
public void Newinvoice() {
	
     Scanner sc = new Scanner(System.in);  
     System.out.print("Enter Customer Name : ");  
      customerName =sc.nextLine();
      
      System.out.print("Enter customer phone number : ");  
      customerphonenumber =sc.nextInt(); 
      Shop shop1 = new Shop();
	  
	   System.out.print("Enter Shop Name : ");
	   shop1.setName(sc.next());
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
	   System.out.print("Enter quantityPrice : ");
	   item1.setQuantityPrice(sc.nextDouble());
	   
	   System.out.println("\"Want to add more items? 1 if yes : \"");
		if (sc.nextInt() != 1) {
			choice = false;
	   }
	   }
  	// Serializaion
	   try{
	       FileOutputStream file = new FileOutputStream("invoice.txt");
	       ObjectOutputStream out = new ObjectOutputStream(file);
	       out.writeObject(customerName);
	       out.writeObject(customerphonenumber);
	       out.writeObject(shop1);
	       out.close();
	       file.close();
	       System.out.println("serialized and saved");
	   }catch (Exception e){
	     e.printStackTrace();
	   }
	//--------------------------------------------------------
	
	   
	   
}

}