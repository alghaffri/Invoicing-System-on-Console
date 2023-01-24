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
		 
		  System.out.println("\t\t\t\t--------------------Invoice-----------------");    
	        System.out.println("FAX: 03AWBPP8756K592"+" \t\t\t\t\t\t\t  TEL: 96677030"); 
	        System.out.println("\t\t\t\t Email :shop@icloud.com "); 
	        System.out.println("\t\t\t\t Website:www.shop.com "); 
		 
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

	   
    
  	// Serializaion
	   try{
	       FileOutputStream file = new FileOutputStream("invoice.txt");
	       ObjectOutputStream out = new ObjectOutputStream(file);
	       out.writeObject(customerName);
	       out.writeObject(customerphonenumber);
	      
	       out.close();
	       file.close();
	       System.out.println("serialized and saved");
	   }catch (Exception e){
	     e.printStackTrace();
	   }
	//--------------------------------------------------------
	
	   try{
	       FileOutputStream file = new FileOutputStream("Shop.txt");
	       ObjectOutputStream out = new ObjectOutputStream(file);
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