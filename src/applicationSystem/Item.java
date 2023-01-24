package applicationSystem;

import java.io.Serializable;

public class Item implements Serializable{

	private String itemName;
	private double  itemId;
	private double unitPrice;
	private double quantity;
	private double quantityPrice;

	
	
	   public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemId() {
		return itemId;
	}

	public void setItemId(double itemId) {
		this.itemId = itemId;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getQuantityPrice() {
		return quantityPrice;
	}

	public void setQuantityPrice(double quantityPrice) {
		this.quantityPrice = quantityPrice;
	}

	public static void displayFormat()   
       {  
           System.out.format("-----------------------------------------------------------------------------------------------------------------------------------");  
           System.out.print("\n item Name \t \t item Id \t \t unit Price \t \t quantity \t \t quantity Price \n");  
           System.out.format("-----------------------------------------------------------------------------------------------------------------------------------\n");  
       }  
          
       // display 
	   
       public void display()   
       {  
         
		System.out.format("" ,itemName, itemId, unitPrice, quantity, quantityPrice);  
     
	
	
}
}